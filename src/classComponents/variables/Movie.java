package classComponents.variables;

public class Movie {
    //instance variables will get the memory when object is created
    int movieId;
    String movieName;
    String duration;

    // static variables will get the memory only once when class is loaded into the memory
    static String companyName;

    //JVM calls main method
    //local variables will get the memory everytime method is called
    public static void main(String[] args) {
        //static int variable = 100;//CTE
        int localVariable = 100;
        System.out.println(localVariable);

    }
}
