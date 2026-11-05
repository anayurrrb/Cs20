package SkillBuilders;

public class SpanishNumbers {

    public static void printSpanishNumber(int num) {
        if (num == 1) {
            System.out.println("1 uno");
        } else if (num == 2) {
            System.out.println("2 dos");
        } else if (num == 3) {
            System.out.println("3 tres");
        } else if (num == 4) {
            System.out.println("4 cuatro");
        } else if (num == 5) {
            System.out.println("5 cinco");
        } else if (num == 6) {
            System.out.println("6 seis");
        } else if (num == 7) {
            System.out.println("7 siete");
        } else if (num == 8) {
            System.out.println("8 ocho");
        } else if (num == 9) {
            System.out.println("9 nueve");
        } else if (num == 10) {
            System.out.println("10 diez");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            printSpanishNumber(i);
        }
    }
}
