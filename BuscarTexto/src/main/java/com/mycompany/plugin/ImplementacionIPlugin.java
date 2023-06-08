package com.mycompany.plugin;

import com.mycompany.api.IPlugin;
import com.mycompany.buscartexto.BuscarTextoPlugin;

public class ImplementacionIPlugin implements IPlugin {

    private String cadena;

    @Override
    public String ejecutarPlugin(String contenido) {
        cadena = new BuscarTextoPlugin().buscarTexto(contenido);
        return cadena;
    }

}
