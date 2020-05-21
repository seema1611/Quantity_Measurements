package com.quantitymeasurement.test;

import com.quantitymeasurement.measure.QuantityMeasurement;
import com.quantitymeasurement.measure.Units;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    //UC-1----FEET----
    @Test
    public void givenZeroFeetAndZeroFeet_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenZeroFeetAndAnotherFeet_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(6.0, Units.FEET);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObjectForFeet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenReferenceObjectForFeet_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurementTest quantityMeasurementTest = new QuantityMeasurementTest();
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurementTest);
    }

    @Test
    public void givenTwoFeetValue_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(5.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(5.0, Units.FEET);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenTwoDifferentFeetValue_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(8.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(5.0, Units.FEET);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }

    //UC-1----INCH----
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        Assert.assertEquals( inch1, inch2, 0.0);
    }

    @Test
    public void givenTwoInchValue_WhenNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(1.0, Units.INCH);
        Assert.assertNotEquals( inch1, inch2, 0.0);
    }

    @Test
    public void givenTwoDifferentType_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(8.0, Units.FEET);
        double inch1 = quantityMeasurement.getUnitConversionOutput(8.0, Units.INCH);
        Assert.assertNotEquals(feet1, inch1, 0.0);
    }

    @Test
    public void givenTwoSameInchValue_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(7.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(7.0, Units.INCH);
        Assert.assertEquals( inch1, inch2, 0.0);
    }
}