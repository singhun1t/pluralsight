package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void accelerate_NormalSpeedChange_SpeedIncrease(){
        //arrange
        Car manvirCar = new Car("Ford", "F150 Raptor");
        int speedChange = 15;
        int expectedSpeed = 15;


        //act (where we are calling the action)
        manvirCar.accelerate((speedChange));

        //assert
        int actualSpeed = manvirCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
    @Test
    public void accelerate_NormalSpeedChange_SpeedDecrease(){
        //arrange
        Car manvirCar = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 10;
        int expectedSpeed = 10;
        manvirCar.accelerate((speedUpBy));

        //act (where we are calling the action)
        manvirCar.brake(slowDownBy);

        //assert
        int actualSpeed = manvirCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);

    }


    @Test
    public void brake_SpeedChangeGreatThanActualSpeed_SpeedIsZero(){
        //arrange
        Car manvirCar = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 25;
        int expectedSpeed = 0;
        manvirCar.accelerate(speedUpBy);

        //act
        manvirCar.brake(slowDownBy);

        //assess
        int actualSpeed = manvirCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

}