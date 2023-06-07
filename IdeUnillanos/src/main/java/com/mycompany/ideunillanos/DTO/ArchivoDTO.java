package com.mycompany.ideunillanos.DTO;

import java.io.File;

public class ArchivoDTO {
    
    private File archivoDTO;

    public ArchivoDTO(File archivoDTO) {
        this.archivoDTO = archivoDTO;
    }
    
    public File getArchivoDTO() {
        return archivoDTO;
    }

    public void setArchivoDTO(File archivoDTO) {
        this.archivoDTO = archivoDTO;
    }
   
}
