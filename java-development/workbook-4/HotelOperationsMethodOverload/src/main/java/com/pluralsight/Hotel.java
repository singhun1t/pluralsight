package com.pluralsight;

public class Hotel {
    String name;
    int numberOfSuites;
    int numberOfRooms;
    int bookedSuites;
    int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
            if(bookedSuites + numberOfRooms <= numberOfSuites){
                bookedSuites += numberOfRooms;
                return true;
            }else {
                return false;
                }
            }else{
                if(bookedBasicRooms + numberOfRooms <= numberOfRooms){
                    bookedBasicRooms += numberOfRooms;
                    return true;
                }else {
                    return false;
                }
            }

        }
        public int getAvailabSuites(){
            return getNumberOfSuites() - bookedSuites;
        }
        public int getAvailableRooms(){
            return getNumberOfRooms() - bookedBasicRooms;
    }


    }

