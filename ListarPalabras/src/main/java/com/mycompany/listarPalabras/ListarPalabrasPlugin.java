package com.mycompany.listarPalabras;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListarPalabrasPlugin {

    public static String listarPalabrasEncontradas(String input) {
        Set<String> palabrasUnicas = new LinkedHashSet<>();

        Pattern patron = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher matcher = patron.matcher(input);

        while (matcher.find()) {
            String palabra = matcher.group();
            palabrasUnicas.add(palabra);
        }

        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabrasUnicas) {
            resultado.append(palabra).append("\n");
        }

        return resultado.toString();
    }
}
