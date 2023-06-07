package com.mycompany.ideunillanos.Controladores;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.Servicios.ServicioArchivo;
import java.io.IOException;
import com.mycompany.ideunillanos.Servicios.IServicioArchivo;

public class ControladorArchivo {

    private final IServicioArchivo iArchivo;
    private static ControladorArchivo controladorArchivo;

    private ControladorArchivo() {
        iArchivo = new ServicioArchivo();
    }

    public static ControladorArchivo getInstance() {
        if (controladorArchivo == null) {
            controladorArchivo = new ControladorArchivo();
        }
        return controladorArchivo;
    }

    public void cargar(ArchivoDTO archivoDTO) throws IOException {
        iArchivo.cargar(archivoDTO);
    }

    public String getContenido() {
        return iArchivo.getContenido();
    }
}
