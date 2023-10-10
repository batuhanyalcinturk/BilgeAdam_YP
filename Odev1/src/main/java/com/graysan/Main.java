package com.graysan;

import java.util.Scanner;


enum HarfDegeri {
    A('1'), E('2'), I('3'), İ('4'), O('5'), Ö('6'), U('7'), Ü('8');

    private final char deger;

    HarfDegeri(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }
}

public class Main {
    public static void main(String[] args) {
        /*int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] cevirMatris = cevirMatris(matris);

        // Ters çevrilmiş matrisi yazdırma
        for (int i = 0; i < cevirMatris.length; i++) {
            for (int j = 0; j < cevirMatris[i].length; j++) {
                System.out.print(cevirMatris[i][j] + " ");
            }
            System.out.println();
        }*/

        /*int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateMatrix(matrix);

        // Çevrilmiş matrisi ekrana yazdır
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir isim girin: ");
        String isim = scanner.nextLine();

        String sonuc = "";

        for (int i = 0; i < isim.length(); i++) {
            char karakter = isim.charAt(i);

            if (karakter == 'A' || karakter == 'a') {
                sonuc += '1';
            } else if (karakter == 'E' ||karakter == 'e') {
                sonuc += '2';
            } else if (karakter == 'I' || karakter == 'ı') {
                sonuc += '3';
            } else if (karakter == 'İ' || karakter == 'i') {
                sonuc += '4';
            } else if (karakter == 'O' || karakter == 'o') {
                sonuc += '5';
            } else if (karakter == 'Ö' || karakter == 'ö') {
                sonuc += '6';
            } else if (karakter == 'U' || karakter == 'u') {
                sonuc += '7';
            } else if (karakter == 'Ü' || karakter == 'ü') {
                sonuc += '8';
            } else {
                sonuc += karakter;
            }
        }

//        for (int i = 0; i < isim.length(); i++) {
//            char karakter = isim.charAt(i);
//            boolean harfDegeriBulundu = false;
//
//            for (HarfDegeri harfDegeri : HarfDegeri.values()) {
//                if (karakter == harfDegeri.name().charAt(0)) {
//                    sonuc += harfDegeri.getDeger();
//                    harfDegeriBulundu = true;
//                    break;
//                }
//            }
//
//            if (!harfDegeriBulundu) {
//                sonuc += karakter;
//            }
//        }

        System.out.println("Dönüştürülen isim: " + sonuc);

        /*String input = "batuhan yalcinturk";
        int n = 2;

        String result = removeRepeatingChars(input, n);
        System.out.println(result);*/
    }





    public static int[][] cevirMatris(int[][] matris) {
        int[][] cevirMatris = new int[3][3];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                cevirMatris[i][j] = matris[2 - i][2 - j];
            }
        }

        return cevirMatris;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static String removeRepeatingChars(String input, int n) {
        // Sonuç stringini bir karakter dizisi olarak oluştur
        char[] result = new char[input.length()];
        int[] charCount = new int[256]; // ASCII karakterler için bir dizi
        int resultIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCount[c] < n) {
                result[resultIndex] = c;
                resultIndex++;
            }
        }

        // Sonucu karakter dizisinden stringe dönüştür
        return new String(result, 0, resultIndex);
    }
}