package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length %2 ==0;
    }

    public Integer[] range(int start, int stop) {
        Integer [] arrForSpecifiedRange = new Integer[stop - (start -1)];
        int current = start;
        for(int i =0; i < arrForSpecifiedRange.length; i++){
            arrForSpecifiedRange[i] = current;
            current++;
        }
        return arrForSpecifiedRange;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }
    //?? getProductOfLastTwo
    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length -2];
    }
}
