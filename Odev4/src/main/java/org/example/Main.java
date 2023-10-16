package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BYReader myReader = new BYReader("D:/dosya.txt");
        ArrayList<String> kelimeler = myReader.readWords();
        String satir = myReader.readLineAt(8);

        System.out.println("Satır 4: " + satir);

        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }


    }
}