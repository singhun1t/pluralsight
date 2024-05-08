package pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_Test(){
        //arrange
        Employee manvir = new Employee(1,"Manvir","sales",24.00);


        //act
        manvir.punchIn(8.00);
        manvir.punchOut(21.00);
        //assert
        double expectedTime = 13.00;
        assertEquals(expectedTime,manvir.getHoursWorked());
    }

}