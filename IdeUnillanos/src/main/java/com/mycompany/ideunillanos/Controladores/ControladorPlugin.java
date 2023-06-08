package com.mycompany.ideunillanos.Controladores;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.ContratosInterfaces.IServicioPlugin;
import com.mycompany.ideunillanos.fabrica.Fabrica;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ControladorPlugin {

    private static ControladorPlugin controladorPlugin;
    private final IServicioPlugin IserviciosPlugin;

    private ControladorPlugin() {
        this.IserviciosPlugin = Fabrica.inicializarFactory().factoryServicePlugin();
    }

    public static ControladorPlugin getInstance() {
        if (controladorPlugin == null) {
            controladorPlugin = new ControladorPlugin();
        }
        return controladorPlugin;
    }

    public void cargarPlugin(ArchivoDTO archivoDTO) throws IOException {
        IserviciosPlugin.cargar(archivoDTO);
    }

    public Map<String, File> obtenerPlugins() {
        return IserviciosPlugin.obtenerPlugins();
    }

    public String ejecutarPlugin(String nombrePlugin, String contenido) throws Exception {
        return IserviciosPlugin.ejecutarPlugin(nombrePlugin, contenido);
    }
}
