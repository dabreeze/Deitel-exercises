package Myers_briggs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyersBriggsMainTest {
    @Test
    public void canDisplayMessage(){
        MeyersBriggs mya = new MeyersBriggs();
        mya.displayMessage();
        assertEquals("(A) Expend energy, enjoy groups OR (B)conserve energy, enjoy one-on-one", "hello");
    }

    @Test
    public void getValue()
    {
        MeyersBriggs mya = new MeyersBriggs();
        mya.displayMessage();
        mya.getResponse();
        assertEquals("A", "B");
    }

}