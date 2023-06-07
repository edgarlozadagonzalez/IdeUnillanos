package com.mycompany.ideunillanos.Servicios;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import java.io.IOException;

public interface IServicioArchivo {
    public void cargar(ArchivoDTO archivoDTO) throws IOException;
    public String getContenido();
}