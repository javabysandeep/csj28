package oops.abstraction.interfaceDemos;

@FunctionalInterface
public interface OneMethodInterface {
    void m1();
   //void m2();
    // static methods are allowed from java 8
   public static void main(String[] args) {
       //we cannot create the object of an interface
//       OneMethodInterface ref = new OneMethodInterface();
   }
}
