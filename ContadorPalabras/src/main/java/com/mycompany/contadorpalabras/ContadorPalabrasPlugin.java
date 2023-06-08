package com.mycompany.contadorpalabras;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalabrasPlugin {

    public String contarPalabras(String contenido) {
        // Dividir el contenido en palabras
        String[] palabras = contenido.split("\\s+");

        // Crear un mapa para contar las palabras
        Map<String, Integer> contadorPalabras = new HashMap<>();

        // Contar las palabras y almacenar los resultados en el mapa
        for (String palabra : palabras) {
            if (contadorPalabras.containsKey(palabra)) {
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        }

        // Construir la lista de palabras sin repetir y sus frecuencias
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
            String palabra = entry.getKey();
            int frecuencia = entry.getValue();
            resultado.append("Palabra: ").append(palabra).append(" -> Número Repetidas: ").append(frecuencia).append("\n");
        }

        return resultado.toString();
    }
}
