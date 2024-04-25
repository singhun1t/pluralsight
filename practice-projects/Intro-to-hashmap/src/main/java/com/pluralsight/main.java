package com.pluralsight;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, String> statesAndCapital
                = new HashMap<>();
        statesAndCapital.put("CT", "Hartford");
        statesAndCapital.put("CA", "Sacramento");
        statesAndCapital.put("WA", "Olympia");
        statesAndCapital.put("TX", "Austin");
        statesAndCapital.put("FL", "Tallahassee");

      //  statesAndCapital.remove("TX");//how to remove from hashmap
        //statesAndCapital.clear() ; will remove everything from hashmap
      //  System.out.println(statesAndCapital);
       // System.out.println(statesAndCapital.get("FL")); //print out a certain element from the hashmap

        //iterating through items in a hashmap to get capitals
        for(String capital : statesAndCapital.values()){//take values of statesandcapitals & stores in capital
            System.out.println(capital);
        }
        //to display the keys
        for(String key : statesAndCapital.keySet()){
           // System.out.println(key);
            System.out.println(key + "; " +statesAndCapital.get(key));//will get value of key and concatenate);
        }



    }
}
