package com.pluralsight;

public class ForEach {
    public static void main(String[] args) {
        /*
        //showcasing for each loop
        String[] schools = {"Calliet", "Cary", "Skyline", "SFASU", "TAMU"};
        for (int i = 0; i <schools.length; i++) {
            System.out.println(schools[i]);
        }
        System.out.println("==============");
        //stores schools array values into school to be printed (gives what is above but much less code)
        for (String school : schools){
            System.out.println(school);
            Arrays.sort(schools)
        }

         */
        int [] nums = getNumbers();
        displayNumbers(nums);

        //setup a method to dispaly numbers within the nums array
    }
    public static void displayNumbers(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }
    public static int[] getNumbers(){
        int [] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        return nums;
    }
}
