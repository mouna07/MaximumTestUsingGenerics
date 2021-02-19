package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {
    /* Welcome message test method */
    @Test
    public void shouldPrintWelcomeMessage() {
        MaximumCheck.printWelcomeMessage();
    }

    /* Maximum Integer element at the position 1 */
    @Test
    public void maximumIntegerAtPosition1() {
        Integer maximumInteger = MaximumCheck.maximumInteger(12, 4, 11);
        Assert.assertSame(12, maximumInteger);
    }

    /* Maximum Integer element at the position 2 */
    @Test
    public void maximumIntegerAtPosition2() {
        Integer maximumInteger = MaximumCheck.maximumInteger(4, 12, 11);
        Assert.assertSame(12, maximumInteger);
    }

    /* Maximum Integer element at the position 3 */
    @Test
    public void maximumIntegerAtPosition3() {
        Integer maximumInteger = MaximumCheck.maximumInteger(4, 11, 12);
        Assert.assertSame(12, maximumInteger);
    }

    /* Maximum Float element at the position 1 */
    @Test
    public void maximumFloatAtPosition1() {
        Float maximumFloat = MaximumCheck.maximumFloat(12.25f, 4.249f, 12.2495f);
        Assert.assertEquals((Float) 12.25f, maximumFloat);
    }

    /* Maximum Float element at the position 2 */
    @Test
    public void maximumFloatAtPosition2() {
        Float maximumFloat = MaximumCheck.maximumFloat(12.25f, 19.99f, 6.62f);
        Assert.assertEquals((Float) 19.99f, maximumFloat);
    }

    /* Maximum Float element at the position 3 */
    @Test
    public void maximumFloatAtPosition3() {
        Float maximumFloat = MaximumCheck.maximumFloat(4.46f, 11.0f, 12.25f);
        Assert.assertEquals((Float) 12.25f, maximumFloat);
    }

    /* Maximum String at the position 1 */
    @Test
    public void maximumStringAtPosition1() {
        String maximumString = MaximumCheck.maximumString("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximumString);
    }

    /* Maximum String at the position 2 */
    @Test
    public void maximumStringAtPosition2() {
        String maximumString = MaximumCheck.maximumString("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximumString);
    }

    /* Maximum String at the position 3 */
    @Test
    public void maximumStringAtPosition3() {
        String maximumString = MaximumCheck.maximumString("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximumString);
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

}