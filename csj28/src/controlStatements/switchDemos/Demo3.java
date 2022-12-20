package controlStatements.switchDemos;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter the file ");
        Scanner scanner = new Scanner(System.in);
        String fileExtension = scanner.next();
        switch (fileExtension) {
            case "txt":
                readText();
                break;
            case "pdf":
                readPdf();
                break;
            case "word":
                readWord();
                break;
            case "html":
                readHtml();
                break;
            case "json":
                readJson();
                break;
            default:
                System.out.println("invalid file type");
        }
    }

    private static void readJson() {
        System.out.println("reading json");
    }

    private static void readHtml() {
        System.out.println("reading html");
    }

    private static void readWord() {
        System.out.println("reading word");
    }

    private static void readPdf() {
        System.out.println("reading pdf");
    }

    private static void readText() {
        System.out.println("reading text");
    }
}
