package oops.inheritance;

public class PersonalLoan extends Loan {
    public static void main(String[] args) {
        PersonalLoan personalLoan = new PersonalLoan();
        personalLoan.loadId = 100;
        personalLoan.loanAmount = 200000;
        personalLoan.loanDuration = 3;
        personalLoan.borrowerName = "mallya";

        System.out.println(personalLoan);

    }
}
