import org.example.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyCoolTest {

    jlwcrews@gmail.com

    //Snorre Ledal
    //snorreledal@hotmail.no
    Amund Myrbostad
    lullinj98@gmail.com

    @Test
    void shouldDoSomething(){
        LeapYear leapYear = new LeapYear();
        assertEquals(leapYear.isLeapYear(2023), false);
        assertEquals(leapYear.isLeapYear(2000), true);
        assertEquals(leapYear.isLeapYear(1998), false);
    }

}
