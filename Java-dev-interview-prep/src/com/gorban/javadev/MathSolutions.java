package com.gorban.javadev;

public class MathSolutions {

    public int calculateSqrt(int input){
        int squareRoot = 0;
        for (int i = 1; i < input; i ++){
            squareRoot = i * i;
            if (squareRoot == input){
                return i;
            } else if (input < squareRoot) {
                return i - 1;
            }
        }
        return 0;
    }

    public int calculateSquareRoot(int input) {
        if (input == 0){
            return 0;
        } else if (input == 1){
            return 1;
        }
        int result = 1;

        for(int i = 1; i <= input/2; i++){
            int temp = i * i;
            if (temp == input){
                return i;
            } else if (temp > input){
                return result;
            } else {
                result = i;
            }
        }
        return result;
    }

//9 -> 3
//4 -> 2
//5 -> 2
}
