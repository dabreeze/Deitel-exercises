package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    public void yearCanBeEntered()
    {
        Date octoberFirst = new Date(10, 1,2021);
        octoberFirst.displayDate();

        assertEquals(2021, octoberFirst.getYear());
    }

    @Test
    public void monthCanDisplayMonth()
    {
        Date octoberFirst = new Date(10, 1,2021);
       assertEquals(10, octoberFirst.getMonth());
    }
    @Test
    public void dayCanBeEntered()
    {
        Date octoberFirst = new Date(10, 1,2021);
        assertEquals(1, octoberFirst.getDay());
    }

    @Test
    public void dateCanBeDisplayed()
    {
        Date octoberFirst = new Date(10, 1,2021);
        octoberFirst.displayDate();
        assertEquals("2021 /10 /1", octoberFirst.displayDate());
    }

}