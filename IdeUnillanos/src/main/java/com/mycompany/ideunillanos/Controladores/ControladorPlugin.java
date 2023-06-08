package com.mycompany.ideunillanos.Controladores;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.Servicios.ServiciosPlugin;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ControladorPlugin {

    private static ControladorPlugin controladorPlugin;
    private final ServiciosPlugin serviciosPlugin;

    public ControladorPlugin() {
        this.serviciosPlugin = new ServiciosPlugin();
    }

    public static ControladorPlugin getInstance() {
        if (controladorPlugin == null) {
            controladorPlugin = new ControladorPlugin();
        }
        return controladorPlugin;
    }

    public void cargarPlugin(ArchivoDTO archivoDTO) throws IOException {
        serviciosPlugin.cargar(archivoDTO);
    }

    public Map<String, File> obtenerPlugins() {
        return serviciosPlugin.obtenerPlugins();
    }

    public String ejecutarPlugin(String nombrePlugin, String contenido) throws Exception {
        return serviciosPlugin.ejecutarPlugin(nombrePlugin, contenido);
    }
}
