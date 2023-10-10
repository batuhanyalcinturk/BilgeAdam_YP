package com.graysan;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ifade girin: ");
        String input = scanner.nextLine();
        scanner.close();

        // Harf ve boşluk sayılarını saklamak için LinkedHashMap oluşturun
        Map<Character, Integer> harfVeBoslukSayilari = new LinkedHashMap<>();

        // String içindeki her karakteri işle
        for (char karakter : input.toCharArray()) {
            if (Character.isLetterOrDigit(karakter) || Character.isWhitespace(karakter)) {
                // Sadece harf, rakam veya boşlukları işle
                if (Character.isLetter(karakter)) {
                    karakter = Character.toLowerCase(karakter); // Büyük/küçük harf farkını yok say
                }
                harfVeBoslukSayilari.put(karakter, harfVeBoslukSayilari.getOrDefault(karakter, 0) + 1);
            }
        }

        // Sonuçları yazdır
        StringBuilder sonuc = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : harfVeBoslukSayilari.entrySet()) {
            sonuc.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(sonuc.toString());*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("kelime gir: ");
        String input = scanner.nextLine();

        // Tekrarlanan harfleri önlemek için bir Set kullanın
        Set<Character> harfSeti = new LinkedHashSet<>();

        // Girilen ifadeyi dolaşarak harfleri ekleyin
        for (char karakter : input.toCharArray()) {
            if (Character.isLetter(karakter)) {
                harfSeti.add(Character.toLowerCase(karakter)); // Büyük/küçük harf farkını yok say
            }
        }

        // Sonucu yazdırın
        StringBuilder sonuc = new StringBuilder();
        for (char harf : harfSeti) {
            sonuc.append(harf);
        }

        System.out.println(sonuc.toString());
    }

}
