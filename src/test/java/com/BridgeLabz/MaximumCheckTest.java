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
}
