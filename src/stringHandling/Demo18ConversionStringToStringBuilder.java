package stringHandling;

public class Demo18ConversionStringToStringBuilder {
    public static void main(String[] args) {
        String str = "welcome";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer: "+str);

        StringBuilder sb1 = new StringBuilder("welcome again");
        StringBuffer sbu1 = new StringBuffer("welcome again");

        String str2 = new String(sb1);
        String str3 = new String(sbu1);

    }
}
