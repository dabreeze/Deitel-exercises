package ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List myArrayList;

    @BeforeEach
    void setUp() {
        myArrayList = new ArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest()
    {
        assertNotNull(myArrayList);
    }
    @Test
    public void newArrayListIsEmptyTest(){
        //given
        //when

        //assert
        assertTrue(myArrayList.isEmpty());

    }
    @Test
    public void
}
