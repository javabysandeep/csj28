package jdbc.cashbook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Income {
    private int incomeId;
    private String incomeTitle;
    private int incomeAmount;
    private Date incomeDate;
}
