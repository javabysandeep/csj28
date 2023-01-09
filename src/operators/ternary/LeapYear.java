package operators.ternary;

public class LeapYear {
    public static void main(String[] args) {
        //if year is divisible by 4 and if it is century then it is divisible by 400

        // leap year examples: 2000, 2020, 2400, 1600, 1200, 2800
        // not leap year: 2021, 2023, 2100, 1900, 1800,
        int year = 2023;
        boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        System.out.println(year+" is leap "+isLeap);
    }
}
