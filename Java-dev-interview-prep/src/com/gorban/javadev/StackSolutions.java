package com.gorban.javadev;

public class StackSolutions {

    public class StackMin{
        private int defaultCapacity = 10;
        private int min = 0;
        private int length = 0;

        private int[] arr;

        public StackMin(){
            arr = new int[this.defaultCapacity];
        }


        public StackMin(int capacity){
            arr = new int[capacity];
        }

        public void push(int value){
            if (length < defaultCapacity){
                arr[length++] = value;
                if (value < min){
                    min = value;
                }
            }
        }

        public int pop(){
            int val = 0;
            if (length >= 1){
                val = arr[length--];
                if (val == min){
                    for (int i = length - 1; i > 0; i--){
                        if (arr[i] < min){
                            min = arr[i];
                        }
                    }
                }
            }
            return val;
        }

        public int getMin(){
            return min;
        }



    }

}
