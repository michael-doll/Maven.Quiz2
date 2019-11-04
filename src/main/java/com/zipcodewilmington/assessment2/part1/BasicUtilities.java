package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {
        return value >=5;
    }
    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return (valueToEvaluate >=5 && valueToEvaluate <= 7);
    }

    public Boolean startsWith(String string, Character character) {
        return string.toUpperCase().charAt(0) == character || string.toLowerCase().charAt(0) == character;
    }
}
