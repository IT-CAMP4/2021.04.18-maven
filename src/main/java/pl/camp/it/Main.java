package pl.camp.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();

            System.out.println("Wpisany tekst: " + text);

        } catch (IOException e) {
            System.out.println("Cos sie zepsuło !!");
        }
    }
}
