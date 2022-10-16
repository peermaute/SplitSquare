package maute.brothers.splitsquare.expenses;

import maute.brothers.splitsquare.expenses.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
