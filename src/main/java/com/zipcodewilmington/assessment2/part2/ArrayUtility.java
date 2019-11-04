package com.zipcodewilmington.assessment2.part2;


public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] array3 = new Integer[array1.length + array2.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array1.length,array2.length);
        return array3;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] tempArrEnd = new Integer[index];
        Integer[] tempArrBeg = new Integer[array.length - index];
        for(int i =0; i < tempArrEnd.length;i++){
            tempArrEnd[i] = array[i];
        }
        for(int i =0; i < tempArrBeg.length;i++){
            tempArrBeg[i] = array[tempArrEnd.length+i];
        }
        return merge(tempArrBeg,tempArrEnd);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer[] array3 = merge(array1,array2);
        for(int i =0; i < array3.length; i++){
            if(array3[i] == valueToEvaluate ){
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int mostCommon = array[0];
        Integer[] bogus = new Integer[0];
        for(int i =0; i < array.length; i++){
            int current = countOccurrence(array,bogus,array[i]);
            if(current > mostCommon){
                mostCommon = current;
            }
        }
        return mostCommon;
    }
}
