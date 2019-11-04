package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    //Three tests fail - Re evaluate to confirm you are understanding the instructions...also note this part of the instructions - "If you have tests that do no pass, you must not comment out the tests; you should have methods that allow the test to fail, if necessary".

    //This doesn't make sense
    public Boolean isGreaterThan5(Integer value) {
        return value >=5;
    }
    //Same issue here
    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    //Same here
    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return (valueToEvaluate >=5 && valueToEvaluate <= 7);
    }

    public Boolean startsWith(String string, Character character) {
        return string.toUpperCase().charAt(0) == character || string.toLowerCase().charAt(0) == character;
    }
}
