package com.mycompany.plugin;

import com.mycompany.api.IPlugin;

public class ImplementacionIPlugin implements IPlugin{

    @Override
    public String ejecutarPlugin(String contenido) {      
        return "respuesta";
    }
}
