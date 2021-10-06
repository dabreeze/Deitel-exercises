//package chapterThree;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import java.util.Scanner;
//
//class AccountTest {
//    @Test
//    public void accountSetNameTest(){
//       // given
//        Account harryAccount = new Account();
//        //when
//        harryAccount.setAccountName();
//
//        //check
//        assertEquals("Harrison", harryAccount.getName());
//    }
//
//    @Test
//
//    public void accountCanDepositTest(){
//        //given
//        Account harryAccount = new Account();
//        //when
//        harryAccount.deposit(5000);
//        //check
//        assertEquals(5000, harryAccount.getAccountBalance());
//    }
//    @Test
//    public void accountCannotDepositNegativeValueTest(){
//        //giver
//        Account harryAccount = new Account();
//        //when
//        harryAccount.deposit(-500);
//        //check
//        assertEquals(0, harryAccount.getAccountBalance());
//    }
//
//    @Test
//    public void accountCanWithdrawTest(){
//        //given
//        Account harryAccount = new Account();
//        harryAccount.deposit(7000);
//        //when
//        harryAccount.withdraw(6000);
//        //check
//        assertEquals(1000, harryAccount.getAccountBalance());
//    }
//
//
//
//
//
//}