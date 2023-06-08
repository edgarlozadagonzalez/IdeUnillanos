package com.mycompany.plugin;

import com.mycompany.api.IPlugin;
import com.mycompany.contadorpalabras.ContadorPalabrasPlugin;

public class ImplementacionIPlugin implements IPlugin {

    private String cadena;

    @Override
    public String ejecutarPlugin(String contenido) {
        return cadena = new ContadorPalabrasPlugin().contarPalabras(contenido);
    }

}
