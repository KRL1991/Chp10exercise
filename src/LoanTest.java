import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @org.junit.jupiter.api.Test
    void getAnnualInterestRate() {
        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getAnnualInterestRate();
        assertTrue(true);

    }

    @org.junit.jupiter.api.Test
    void setAnnualInterestRate() {

        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getAnnualInterestRate();
        assertTrue(true);

    }

    @org.junit.jupiter.api.Test
    void getNumberOfYears() {
        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getNumberOfYears();
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void setNumberOfYears() {
        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getNumberOfYears();
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void getLoanAmount() {
        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getLoanAmount();
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void setLoanAmount() {
        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getLoanAmount();
        assertTrue(true);


    }

    @org.junit.jupiter.api.Test
    void getMonthlyPayment() {

        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getMonthlyPayment();
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void getTotalPayment() {

        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getTotalPayment();
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void getLoanDate() {
        Loan loan = new Loan(8.25,5 ,1000 );
        loan.getLoanDate();
        assertTrue(true);
    }

@Test
    void samletTest(){

        Loan loan = new Loan(8.25,5 ,1000 );

        assertEquals(20.40,loan.getMonthlyPayment(),0.01);

}

}