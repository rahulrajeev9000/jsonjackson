package com.spartaglobal.jsondatajackson;

import JacksonDeserialisation.RatesDeserialiser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RatesDeserialisationTests {
    private static RatesDeserialiser rates;
    @BeforeClass
    public static void setup(){
        rates = new RatesDeserialiser("resources/rates.json");
    }

    @Test
    public void testSuccess(){
        Assert.assertTrue(rates.ratesMapped.isSuccess());
    }
    @Test
    public void testDate(){
        Assert.assertEquals("2018-10-10",rates.ratesMapped.getDate());
    }
    @Test
    public void testGerBase(){
        Assert.assertEquals("EUR",rates.ratesMapped.getBase());
    }
    @Test
    public void testGetGBP(){
        Assert.assertEquals(4.234904d ,rates.ratesMapped.getRates().get("AED"),2);
    }
}
