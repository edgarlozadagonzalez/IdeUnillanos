package com.mycompany.ideunillanos.Servicios;

import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.Entidades.Archivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ServicioArchivo implements IServicioArchivo {

    private Archivo archivo;

    @Override
    public void cargar(ArchivoDTO archivoDTO) throws IOException {
        StringBuilder contenido = new StringBuilder();
        archivo = new Archivo(archivoDTO.getArchivoDTO());
        
        if (!archivo.getExtension().equals("java")) {
            throw new IOException("El archivo debe ser de extensión .java");
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoDTO.getArchivoDTO()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contenido.append(line);
                contenido.append("\n");
            }
            archivo.setContenido(contenido.toString());
        } catch (IOException e) {
            throw e;
        }
    }

    @Override
    public String getContenido() {
        return archivo.getContenido();
    }
}