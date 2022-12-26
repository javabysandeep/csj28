package controlStatements.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        /*
        *   20 40 60 80 100 120 140 160 180 200
            21 42 63 84 105 126 147 168 189 210
            22 44 66 88 110 132 154 176 198 220
            23 46 69 92 115 138 161 184 207 230
            24 48 72 96 120 144 168 192 216 240
            25 50 75 100 125 150 175 200 225 250
        *
        * */
        //print the tables
        int startRange = 20;
        int endRange = 40;
        //outer for loop: loops from one number to another number
        for (int number = startRange; number<=endRange ; number++) {
            //print the table for number
            for (int i = 1; i <=10; i++) {
                System.out.print(i*number+" ");
            }
            System.out.println();

        }
    }
}
