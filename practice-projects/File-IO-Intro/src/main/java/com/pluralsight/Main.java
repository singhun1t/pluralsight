package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {//Creating a File Writer

    public static void main(String[] args) {
        try {
            FileWriter potatoWriter = new FileWriter("skills.txt", true);

            //instead of using filewriter directly, use bufferedwriter
            BufferedWriter bufferedWriter = new BufferedWriter(potatoWriter);

            //can write into the txt file with the next line
            potatoWriter.write("skills\n");
            potatoWriter.write("Git, HTML, CSS, Java\n");
            potatoWriter.write("Hello I am a Potato");
            //close the bufferedWriter
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("an error has occurred");
        }
    }
}
