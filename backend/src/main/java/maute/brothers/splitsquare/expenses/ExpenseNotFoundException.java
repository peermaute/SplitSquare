package maute.brothers.splitsquare.expenses;

public class ExpenseNotFoundException extends RuntimeException {
    public ExpenseNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
