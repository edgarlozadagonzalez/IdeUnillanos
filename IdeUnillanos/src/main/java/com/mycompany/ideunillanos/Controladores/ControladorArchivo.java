package com.mycompany.ideunillanos.Controladores;
import com.mycompany.ideunillanos.DTO.ArchivoDTO;
import com.mycompany.ideunillanos.Servicios.IServicioArchivo;
import com.mycompany.ideunillanos.Servicios.ServicioArchivo;
import java.io.IOException;

public class ControladorArchivo{
     
    private final IServicioArchivo iServicioArchivo;
    private static ControladorArchivo controladorArchivo; 

    private ControladorArchivo() {
        iServicioArchivo = new ServicioArchivo();
    }

    public static ControladorArchivo getInstance(){
        if(controladorArchivo == null){
            controladorArchivo = new ControladorArchivo();
        }
        return controladorArchivo;
    }
    
    public String cargar(ArchivoDTO archivoDTO) throws IOException {
       return  iServicioArchivo.cargar(archivoDTO);
    }
    
}
