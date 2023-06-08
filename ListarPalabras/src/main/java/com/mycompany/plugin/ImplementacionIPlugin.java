package com.mycompany.plugin;

import com.mycompany.api.IPlugin;
import com.mycompany.listarPalabras.ListarPalabrasPlugin;

public class ImplementacionIPlugin implements IPlugin{

    @Override
    public String ejecutarPlugin(String contenido) {      
        return ListarPalabrasPlugin.listarPalabrasEncontradas(contenido);
    }
}
