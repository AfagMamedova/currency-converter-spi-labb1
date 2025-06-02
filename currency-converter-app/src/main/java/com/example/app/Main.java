
package com.example.app;

import com.example.api.CurrencyConverter;
import com.example.api.ConverterName;

import java.util.*;
import java.util.ServiceLoader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<CurrencyConverter> converters = new ArrayList<>();
        Map<Integer, CurrencyConverter> menu = new HashMap<>();
        int index = 1;

        for (CurrencyConverter converter : ServiceLoader.load(CurrencyConverter.class)) {
            ConverterName annotation = converter.getClass().getAnnotation(ConverterName.class);
            if (annotation != null) {
                System.out.println(index + ": " + annotation.value());
                menu.put(index++, converter);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Välj konverterare: ");
        int choice = scanner.nextInt();

        CurrencyConverter selected = menu.get(choice);
        if (selected != null) {
            System.out.print("Ange belopp att konvertera: ");
            double amount = scanner.nextDouble();
            System.out.println("Resultat: " + selected.convert(amount));
        } else {
            System.out.println("Ogiltigt val.");
        }
    }
}
