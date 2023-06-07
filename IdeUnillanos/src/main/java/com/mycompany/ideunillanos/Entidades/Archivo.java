package com.mycompany.ideunillanos.Entidades;

import java.io.File;

public class Archivo{
    
    private File archivo;
    private String nombre;
    private String extension;
    private String path;
    private String contenido;

    public Archivo(File archivo) {
        this.archivo = archivo;
        String[] info = archivo.getName().split("\\.");
        this.nombre = info[0];
        this.extension = info[1];
        this.path = archivo.getPath();
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

    public String getPath() {
        return path;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
