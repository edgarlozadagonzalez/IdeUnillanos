package com.mycompany.ideunillanos.Servicios;

import com.mycompany.ideunillanos.ContratosInterfaces.IServicioPlugin;
import com.mycompany.api.IPlugin;
import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.Entidades.Archivo;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class ServicioPlugin implements IServicioPlugin {

    private Map<String, File> plugins = new HashMap<>();
    private final String rutaPlugins = "../Componentes/";
    private Archivo archivo;

    @Override
    public void cargar(ArchivoDTO archivoDTO) throws IOException {
        archivo = new Archivo(archivoDTO.getArchivoDTO());
        try {
            Path ruta = archivo.getPath();
            
            if (!archivo.getExtension().equals("jar")) {
                throw new IOException("El componente debe ser de extensión .jar");
            }
            
            String rutaAbsolutaPlugins = new File(rutaPlugins).getAbsolutePath();
            File directorioPlugins = new File(rutaAbsolutaPlugins);
            if (!directorioPlugins.exists()) {
                directorioPlugins.mkdirs();
            }
            Path rutaDestino = Paths.get(rutaPlugins, archivo.getNombre());
            Files.copy(ruta, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
            agregarPlugin();
        } catch (IOException e) {
            System.out.println(e.toString());
            throw e;
        }
    }

    public void agregarPlugin() {
        plugins.put(archivo.getNombre(), archivo.getArchivo());
    }

    @Override
    public Map<String, File> obtenerPlugins() {
        return plugins;
    }

    private Archivo buscarPluginNombre(String nombrePlugin) {
        archivo = null;
        for (Map.Entry<String, File> entry : plugins.entrySet()) {

            if (entry.getKey().equals(nombrePlugin)) {
                archivo = new Archivo(entry.getValue());
            }
        }
        return archivo;
    }

    @Override
    public String ejecutarPlugin(String nombrePlugin, String contenido) throws Exception {
        archivo = buscarPluginNombre(nombrePlugin);
        try {
            URLClassLoader child = new URLClassLoader(
                    new URL[]{archivo.getArchivo().toURI().toURL()},
                    this.getClass().getClassLoader()
            );
            Class classToLoad = Class.forName("com.mycompany.plugin.ImplementacionIPlugin", true, child);

            Method method = classToLoad.getDeclaredMethod("ejecutarPlugin", contenido.getClass());

            System.out.println(archivo.getPath().toString());

            IPlugin plugin = (IPlugin) classToLoad.newInstance();
            return plugin.ejecutarPlugin(contenido);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }
}
