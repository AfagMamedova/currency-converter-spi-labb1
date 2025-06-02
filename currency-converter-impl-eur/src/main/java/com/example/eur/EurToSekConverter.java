
package com.example.eur;

import com.example.api.CurrencyConverter;
import com.example.api.ConverterName;

@ConverterName("EUR till SEK")
public class EurToSekConverter implements CurrencyConverter {
    public double convert(double amount) {
        return amount * 11.2;
    }
}
