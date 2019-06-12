package com.spartaglobal.jsondatajackson;

import JacksonDeserialisation.RatesDeserialiser;
import JacksonManualParsing.JacksonManualExample;

/**
 * Hello world!
 *
 */
public class App 
{
    JacksonManualExample manualExample = new JacksonManualExample("resources/rates.json");
    public static void main( String[] args )
    {
        JacksonManualExample manualExample = new JacksonManualExample("resources/rates.json");
        RatesDeserialiser ratesDeserialiser = new RatesDeserialiser("resources/rates.json");
        System.out.println( ratesDeserialiser.ratesMapped.getDate() );
    }
}
