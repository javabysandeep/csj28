package jdbc.cashbook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Expense {
    private int expenseId;
    private String expenseTitle;
    private int expenseAmount;
    private Date expenseDate;
    private String notes;
}
