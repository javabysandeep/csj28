package oops.inheritance;

import lombok.ToString;

//Base, parent, super
@ToString
public class Loan {
    int loadId;
    int loanAmount;
    int rateOfInterest;
    int loanDuration;
    String borrowerName;

    // common methods
    void apply() {
    }

    void checkLoanEligibility() {
    }

    void calculateInterestPayment() {
    }

}