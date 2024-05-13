package com.pluralsight;

public class NameFormatter {
    private String firstName;
    private String middleName;
    private String lastName;
    private String title;
    private String nickname;
    private String suffix;

    public NameFormatter(String firstName, String middleName, String lastName, String title, String nickname, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
        this.nickname = nickname;
        this.suffix = suffix;
    }

    public static String format(String firstName, String lastName){
        return lastName + " " + firstName;
    }
    public static String format(String prefix, String firstName, String middleName, String lastName,String suffix){
        String formattedName = "";
        if (prefix!=null){
            formattedName += prefix + " ";
        }
        formattedName += lastName;
        if(middleName!=null){
            formattedName += middleName.charAt(0) + ". ";
        }
        formattedName += lastName;
        if(suffix!=null){
            formattedName += ", " + suffix;
        }
        return formattedName;

    }
    public static String format(String fullName){
        String []parts = fullName.split(", ");
        return format(parts[1],parts[0]);
    }
}
