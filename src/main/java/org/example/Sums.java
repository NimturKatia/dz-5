package org.example;

public class Sums {
    int a, b, c, d;
    int sum1, sum2;

    public void setRandomizedValues() {
        a =  (int) (Math.random() * 50) + 1;
        b =  (int) (Math.random() * 50) + 1;
        c =  (int) (Math.random() * 50) + 1;
        d =  (int) (Math.random() * 50) + 1;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }

    public void findSums(){
        sum1 = a + b;
        sum2 = c + d;
    }

    public void changeSums() {
        sum1 += 1;
        sum2 -= 2;
        System.out.println("Sums changed!");
    }

    public void isAnEvenNumber() {
        boolean isEven = ((sum1 % 2) == 0) || ((sum2 % 2) == 0);
        if (isEven) {
            System.out.println("One of the sums is an even number! " + true);
        }
    }
}
