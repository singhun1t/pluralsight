package com.pluralsight;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //int [] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        //String [] names = {"Ray","Brya","Pratik", "Anita" };
        //System.out.println(nums.length);
        //System.out.println(nums[1]);

        int[] nums = new int[5];

        //nums[1] =15;
        /*for (int i = 0; i <nums.length; i++) {
            nums[i] =5; //places 5 in every spot of the array
        }
        */
        Arrays.fill(nums,5); //Does the above, but in a quicker way

        for(int i =0; i< nums.length;i++){
            System.out.println(nums[i]+ " ");
        }
        System.out.println();
    }
}
