package com.quantitymeasurement.measure;

public class QuantityMeasurement {
    private double value;
    private Units unitType;

    public double getUnitConversionOutput(double value, Units unitType) {
        if (unitType.equals(Units.C))
            return value * unitType.unitType + 32;
        else if (unitType.equals(Units.F))
            return value * unitType.unitType;
        return value * unitType.unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unitType == that.unitType;
    }
}