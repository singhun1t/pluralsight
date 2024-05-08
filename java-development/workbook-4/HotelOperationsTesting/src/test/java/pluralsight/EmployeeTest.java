package pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_Test_StartTimeNotSet_StartTimeSetToGivenTime(){
        //arrange
        Employee manvir = new Employee(1,"Manvir","sales",24.00);


        //act
        manvir.punchIn(8.00);

        //assert

        assertEquals(8.0,manvir.getStartTime());
    }
    @Test
            public void punchOut_HoursNotSet_HoursWorkedSetCorrectly() {
        //arrange
        Employee manvir = new Employee(1, "Manvir", "sales", 24.00);
        manvir.punchIn(9.0);

        //act
        manvir.punchOut(17.5);

        //assert
        assertEquals(8.5, manvir.getHoursWorked());
    }

}