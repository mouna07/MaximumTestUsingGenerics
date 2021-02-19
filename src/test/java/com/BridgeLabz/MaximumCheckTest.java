package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {
    /* Welcome message test method */
    @Test
    public void shouldPrintWelcomeMessage() {
        MaximumCheck.printWelcomeMessage();
    }


    /* Maximum Integer among the given Generic set */
    @Test
    public void maximumObjectInteger() {
        Integer maximumObject = MaximumCheck.maximumOfObject(240, 250, 220);
        Assert.assertEquals((Integer) 250, maximumObject);
    }

    /* Maximum Float among the given Generic set */
    @Test
    public void maximumObjectFloat() {
        Float maximumObject = MaximumCheck.maximumOfObject(9.999f, 10.001f, 10.0f);
        Assert.assertEquals((Float) 10.001f, maximumObject);
    }

    /* Maximum String among the given Generic set */
    @Test
    public void maximumObjectString() {
        String maximumObject = MaximumCheck.maximumOfObject("BridgeLabz", "Capgemini", "Sogeti");
        Assert.assertEquals((String) "Sogeti", maximumObject);
    }

    /* Maximum Integer among the given Generic set */
    @Test
    public void given_Generic_IntegerValues_returns_true() {
        Integer maxValueInteger = new MaximumCheck<Integer>(6, 7, 8).findMaxValueAtAnyPosition();
        Assert.assertEquals((Integer) 8, maxValueInteger);
    }

    /* Maximum Float among the given Generic set */
    @Test
    public void given_Generic_FloatValues_returns_true() {
        Float maxValueFloat = new MaximumCheck<Float>(6.9f, 9.9f, 8.0f).findMaxValueAtAnyPosition();
        Assert.assertEquals((Float) 9.9f, maxValueFloat);
    }

    /* Maximum String among the given Generic set */
    @Test
    public void given_Generic_StringValues_returns_true() {
        String maxValueString = new MaximumCheck<String>("Yahoo", "Google", "Microsoft").findMaxValueAtAnyPosition();
        Assert.assertEquals((String) "Yahoo", maxValueString);
    }

    /* Maximum Integer Value in multiple argument case */
    @Test
    public void givenVarArguments_return_maxInteger_as_true() {
        Integer maxValueInteger = MaximumCheck.maximumOfObject(46, 87, 98, 354, 23, 54, 65, 5, 23, 12, 214);
        Assert.assertEquals((Integer) 354, maxValueInteger);
    }

    /* Maximum Float Value in multiple argument case */
    @Test
    public void givenVarArguments_return_maxFloat_as_true() {
        Float maxValueInteger = MaximumCheck.maximumOfObject(999.99f, 999.998f, 999.9989f, 999.997f, 999.0f, 996f);
        Assert.assertEquals((Float) 999.9989f, maxValueInteger);
    }

    /* Maximum String Value in multiple argument case */
    @Test
    public void givenVarArguments_return_maxString_as_true() {
        String maxValueInteger = MaximumCheck.maximumOfObject("Rcb", "Mi", "Kkr", "Csk", "Kxip", "Srh", "Rr", "Dc");
        Assert.assertEquals((String) "Srh", maxValueInteger);
    }

}