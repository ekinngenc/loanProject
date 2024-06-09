import exceptions.UnknownLoanException;
import loans.CommercialCreditLoan;
import loans.HomeLoan;
import loans.Loan;
import loans.VehicleLoan;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Loan> loans = Arrays.asList(
                new CommercialCreditLoan(),
                new VehicleLoan(),
                new HomeLoan()
        );

        double total = calculateLoans(loans);
        System.out.println("Total Value: " + total);
    }

    public static double calculateLoans(List<Loan> loans) {
        double sum = 0;
        for (Loan loan : loans) {
            if(loan == null) {
                throw new UnknownLoanException("Unknown Loan Exception");
            }
            sum += loan.calculateLoans();
        }
        return sum;
    }
}

