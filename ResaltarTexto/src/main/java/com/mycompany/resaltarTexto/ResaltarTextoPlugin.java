package com.mycompany.resaltarTexto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResaltarTextoPlugin {

    private final String[] PALABRAS_RESERVADAS = {
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
        "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
        "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
        "interface", "long", "native", "new", "package", "private", "protected", "public",
        "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile", "while", "out"
    };

    public String resaltarPalabras(String contenido) {
        String resaltado = contenido;
        for (String palabra : PALABRAS_RESERVADAS) {
            Pattern patron = Pattern.compile("\\b" + palabra + "\\b");
            Matcher matcher = patron.matcher(resaltado);
            resaltado = matcher.replaceAll("<span style='color: blue; font-weight: bold;'>$0</span>");
        }
        return resaltado;
    }
}
