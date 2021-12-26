package com.codechef;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// sort an array in descending order by using bubble sort
      int[] num = {7,5,8,9,1,0,-6,-8,-3};
      descsort(num);
        System.out.println(Arrays.toString(num));
    }
    public static void descsort(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=1;j< num.length-1;j++){
                if(num[j-1]<num[j]){
                    int temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
