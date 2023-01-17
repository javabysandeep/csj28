package classComponents.nestedClasses;

public class ConstantTest {
    public static void main(String[] args) {
        System.out.println("Static variable of Constant  : ServerName " + Constant.serverName);

        System.out.println("mysql username "+ Constant.Mysql.USERNAME);
        System.out.println("mysql password "+ Constant.Mysql.PASSWORD);


        System.out.println("oracle username "+ Constant.Oracle.USERNAME);
        System.out.println("oracle password "+ Constant.Oracle.PASSWORD);
    }
}
