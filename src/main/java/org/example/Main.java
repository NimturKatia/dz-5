package org.example;
public class Main
{
    public static void main( String[] args ) {
        Sums sumsObj = new Sums();

        sumsObj.setRandomizedValues();
        sumsObj.findSums();
        System.out.println("Sum1 > Sum2: " + (sumsObj.sum1 > sumsObj.sum2));
        sumsObj.isAnEvenNumber();
        sumsObj.changeSums();
        System.out.println("Sum1 > Sum2: " + (sumsObj.sum1 > sumsObj.sum2));
        sumsObj.isAnEvenNumber();
    }
}
