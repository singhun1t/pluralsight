package pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
@Test
    //arange
    public void checkIn_RoomInitialStatus_RoomIsOccupiedAndDirty(){
    Room myRoom = new Room(2,200);


    //act
    myRoom.checkIn();

    //assert
    assertTrue(myRoom.isOccupied());
    assertTrue(myRoom.isDirty());
   /* boolean isAvailable = false;
    assertEquals(isAvailable, myRoom.isAvailable());

    */
}
@Test
//arrange
public void checkout_RoomIsOccupied_RoomIsNotOccupied(){
    Room myRoom2 = new Room(2,200);
    myRoom2.checkIn();

    //act
    myRoom2.checkout();

    //assert
    assertFalse(myRoom2.isOccupied());

    /*boolean checkOut = false;
    assertEquals(myRoom2.isOccupied(),checkOut);

     */

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
    assertFalse(myRoom2.isDirty());
   /* boolean ableToClean = false;
    assertEquals(ableToClean, myRoom2.isDirty());

    */
}

}