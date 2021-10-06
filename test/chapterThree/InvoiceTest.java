package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice newInvoice;
    @BeforeEach
        void setup(){
        newInvoice = new Invoice();
    }
    @Test
    public void invoiceCanBeCreated()
    {
       newInvoice = new Invoice();
    }

    @Test
    public void calculateInvoiceAmount()
    {
        newInvoice.calculateInvoice(40, 2);
        assertEquals(80,newInvoice.calculateInvoice(40,2));

    }
    @Test
    public void quantityCannotBeZero()
    {
        newInvoice.calculateInvoice(-1, -4);
        assertEquals(0,newInvoice.calculateInvoice(-1, -1));
    }


}