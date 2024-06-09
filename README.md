Could you please refactor the code below according object oriented principle ?

public static double calculateLoans(List<Object> loans) {

int sum = 0;
for (Object loan : loans) {
  if(loan instanceof CommericalCreditLoan tf) {
    sum += 21;
  } else if(loan instanceof VehicleLoan xs) {
    sum += 23;
  } else if(loan instanceof HomeLoan xmf) {
    sum += 20;
  } else
    throw new UnknownLoanException();
  }
return sum;
}
