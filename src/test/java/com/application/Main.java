package com.application;


import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * User: mbauer
 * Date: 9/2/14
 * Time: 1:27 PM
 */
public class Main {

    public static void main(String[] args) {
        String sentence = "Probando distintos metodos para revertir strings";
        System.out.println("Usando librerias utilitarias: " + reverseUtils(sentence));
        System.out.println("Usando for: " + reverseFor(sentence));
    }

    public static String reverseUtils(String sentence) {
        String[] words = sentence.split(" ");
        ArrayUtils.reverse(words);
        return StringUtils.join(words, " ");
    }

    public static String reverseFor(String sentence) {
        String[] parts = sentence.split("\\b");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i > 0 ; i--) {
            sb.append(parts[i]);
        }
        return sb.toString();
    }

}
