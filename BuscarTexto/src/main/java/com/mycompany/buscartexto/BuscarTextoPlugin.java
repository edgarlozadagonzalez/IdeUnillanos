package com.mycompany.buscartexto;

import javax.swing.JOptionPane;

public class BuscarTextoPlugin {

    public String buscarTexto(String contenido) {
        String palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra a buscar: ");
        // Busca la palabra en la cadena contenido
        int fila = -1;
        int columna = -1;
        String[] lineas = contenido.split("\n");
        for (int i = 0; i < lineas.length; i++) {
            int indice = lineas[i].indexOf(palabra);
            if (indice != -1) {
                fila = i + 1;
                columna = indice + 1;
                break;
            }
        }

        // Verifica si se encontró la palabra y devuelve el resultado correspondiente
        if (fila != -1 && columna != -1) {
            return "La palabra \"" + palabra + "\" se encontró en la fila " + fila + ", columna " + columna + ".";
        } else {
            return "La palabra \"" + palabra + "\" no fue encontrada.";
        }
    }
}
