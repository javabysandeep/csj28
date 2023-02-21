package java8Feauters;

@FunctionalInterface
public interface StringProcessor {
   public String process(String str);

    public static void main(String[] args) {
        StringProcessor upperCase = (str) ->  str.toUpperCase();
        System.out.println("Convert uppercase: "+ upperCase.process("welcome lambda"));

        StringProcessor removeSpaces = (str)->str.trim();
        System.out.println(removeSpaces.process("      lambda is making life easy       "));
    }
}
