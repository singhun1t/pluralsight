package pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
@Test
    //arange
    public void checkIn_IfRoomIsAlreadyOccupied_UnableToCheckIn(){
    Room myRoom = new Room(2,200);


    //act
    myRoom.checkIn();

    //assert
    boolean isAvailable = false;
    assertEquals(isAvailable, myRoom.isAvailable());
}
@Test
    //arrange
    public void checkIntoRoom_IfDirty(){
    Room myRoom2 = new Room(2,200);

    //act
    myRoom2.checkIn();

    //assert
    assertEquals(myRoom2.isDirty(),myRoom2.isAvailable());
}
@Test
//arrange
public void checkout(){
    Room myRoom2 = new Room(2,200);
    myRoom2.checkIn();

    //act
    myRoom2.checkout();

    //assert
    boolean checkOut = false;
    assertEquals(myRoom2.isOccupied(),checkOut);

}

@Test
    //arrange
    public void houseCleaning_IfRoomIsOccupied_notAbleTo(){
    Room myRoom2 = new Room(2,200);
    myRoom2.checkIn();
    myRoom2.checkout();

    //act
    myRoom2.cleanRoom();

    //assert
    boolean ableToClean = false;
    assertEquals(ableToClean, myRoom2.isDirty());
}

}