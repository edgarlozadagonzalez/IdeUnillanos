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
        this.nombre = archivo.getName();
        int indicePunto = nombre.lastIndexOf(".");
        this.extension = nombre.substring(indicePunto + 1);
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
