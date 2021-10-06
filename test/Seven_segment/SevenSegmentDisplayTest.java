package Seven_segment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {
    SevenSegmentDisplay myDisplay;
    int[][] screen;
    @BeforeEach
        void setup(){
        screen = new int[5][4];
        myDisplay = new SevenSegmentDisplay();
    }

    @Test
    public void screenCanShowDefaultDisplay()
    {
        assertEquals(myDisplay, myDisplay);
    }

    @Test
    public void screenCanBeSetTo()
    {
        //screenCanSetA();
        myDisplay.setScreen();

    }

}