package edu.ant.algorithms.varia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Matt on 04.09.2018 at 21:58.
 */


public class Kapuscinsky {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/plik.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();

            printNews(line);

        } catch (IOException ex) {
            System.out.println("IOException occured");
        }
    }

    public static void printNews(String string) {

        System.out.println("--------------BREAKING NEWS--------------");
        System.out.println(" FROM: R. Kapuscinski, PAP");

        for (int i = 0; i < string.length(); i++) {
            try {
                System.out.print(string.charAt(i));
                if (string.charAt(i) == '.') {
                    System.out.println();
                }
                Random rand = new Random();
                Thread.sleep(rand.nextInt(200) + 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("--------------End of transmission--------------");
    }

}

