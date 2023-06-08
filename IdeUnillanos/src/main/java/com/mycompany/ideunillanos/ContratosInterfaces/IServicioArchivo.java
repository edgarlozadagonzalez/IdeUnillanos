package com.mycompany.ideunillanos.ContratosInterfaces;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import java.io.IOException;

public interface IServicioArchivo {
    void cargar(ArchivoDTO archivoDTO) throws IOException;
    String getContenido();
}