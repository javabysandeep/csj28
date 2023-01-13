package classComponents.variables;

public class Demo5 {
    int number1 = 100;//Heap
    int number2 = 200;//Heap

    public static void main(String[] args) {
        Demo5 referenceToDemoClassObject = new Demo5();
        System.out.println(referenceToDemoClassObject.number1);
        System.out.println(referenceToDemoClassObject.number2);
    }
}
