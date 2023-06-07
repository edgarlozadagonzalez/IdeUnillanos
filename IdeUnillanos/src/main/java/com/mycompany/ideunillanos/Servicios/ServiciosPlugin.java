package com.mycompany.ideunillanos.Servicios;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.Entidades.Archivo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class ServiciosPlugin {

    private Map<String, File> plugins = new HashMap<>();
    private final String rutaPlugins = "../plugins/";
    private Archivo archivo;

    public void cargar(ArchivoDTO archivoDTO) throws IOException {
        archivo = new Archivo(archivoDTO.getArchivoDTO());
        try {
            Path ruta = archivo.getPath();
            String rutaAbsolutaPlugins = new File(rutaPlugins).getAbsolutePath();
            File directorioPlugins = new File(rutaAbsolutaPlugins);
            if (!directorioPlugins.exists()) {
                directorioPlugins.mkdirs();
            }
            Path rutaDestino = Path.of(rutaPlugins, archivo.getNombre());
            Files.copy(ruta, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
            agregarPlugin();
        } catch (IOException e) {
            System.out.println(e.toString());
            throw e; // Lanzar la excepción capturada
        }
    }

    public void agregarPlugin() {
        plugins.put(archivo.getNombre(), archivo.getArchivo());
    }

    public Map<String, File> obtenerPlugins() {
        return plugins;
    }
}
