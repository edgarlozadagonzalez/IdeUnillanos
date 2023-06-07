package com.mycompany.ideunillanos.Servicios;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import java.io.IOException;

public interface IServicioArchivo {
    public String cargar(ArchivoDTO archivoDTO) throws IOException;
}