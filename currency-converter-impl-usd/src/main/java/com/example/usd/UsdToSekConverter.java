
package com.example.usd;

import com.example.api.CurrencyConverter;
import com.example.api.ConverterName;

@ConverterName("USD till SEK")
public class UsdToSekConverter implements CurrencyConverter {
    public double convert(double amount) {
        return amount * 10.5;
    }
}
