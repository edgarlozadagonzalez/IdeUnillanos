package com.mycompany.ideunillanos.fabrica;

import com.mycompany.ideunillanos.Servicios.ServicioArchivo;
import com.mycompany.ideunillanos.Servicios.ServicioPlugin;

public class Fabrica {

    private static Fabrica factory;

    private Fabrica() {
    }

    public static Fabrica inicializarFactory() {
        if (factory == null) {
            factory = new Fabrica();
        }
        return factory;
    }

    public ServicioPlugin factoryServicePlugin() {
        return new ServicioPlugin();
    }
    
     public ServicioArchivo factoryServiceArchivo() {
        return new ServicioArchivo();
    }
}
