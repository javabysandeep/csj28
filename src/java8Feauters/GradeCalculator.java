package java8Feauters;

@FunctionalInterface
public interface GradeCalculator {
    public abstract boolean isPass(int score);

    public static void main(String[] args) {
        GradeCalculator ref = (int score) -> score >=35;
        System.out.println("Are you pass :"+ref.isPass(80));
        System.out.println("Are you pass :"+ref.isPass(30));
    }
}
