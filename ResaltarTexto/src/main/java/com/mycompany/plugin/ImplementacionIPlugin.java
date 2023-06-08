package com.mycompany.plugin;

import com.mycompany.api.IPlugin;
import com.mycompany.resaltarTexto.ResaltarTextoPlugin;

public class ImplementacionIPlugin implements IPlugin {
    private String cadena;
    @Override
    public String ejecutarPlugin(String contenido) {
        return cadena = new ResaltarTextoPlugin().resaltarPalabras(contenido);
    }
}
