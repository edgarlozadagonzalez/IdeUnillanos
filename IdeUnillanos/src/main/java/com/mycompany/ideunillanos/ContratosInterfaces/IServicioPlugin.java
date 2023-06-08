package com.mycompany.ideunillanos.ContratosInterfaces;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface IServicioPlugin {

    void cargar(ArchivoDTO archivoDTO) throws IOException;
    Map<String, File> obtenerPlugins();
    String ejecutarPlugin(String nombrePlugin, String contenido) throws Exception;
}
