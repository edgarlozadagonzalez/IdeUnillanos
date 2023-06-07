package com.mycompany.ideunillanos.Entidades;

import java.io.File;
import java.nio.file.Path;

public class Archivo{
    
    private File archivo;
    private String nombre;
    private String extension;
    private Path path;
    private String contenido;

    public Archivo(File archivo) {
        this.archivo = archivo;
        String[] info = archivo.getName().split("\\.");
        this.nombre = info[0];
        this.extension = info[1];
        this.path = archivo.toPath();
    }

    public File getArchivo() {
        return archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public Path getPath() {
        return path;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
