public class Main {

    public static void main(String[] args) {
        max(2);
        max(9);
        max(29);
        max(99);
        max(11);
        max(19);
        max(229);
        max(929);
        max(1102);
        max(35000);
        max(999999);
        printUpwardTriangle();
        printDownwardTriangle();
        printLeftTriangle();
        printRightTriangle();
    }

    public static void max(int num) {
        String s = "";
        String[] base1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] base2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] base3 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        if (num > 0 && num < 10) {
            s = base1[num];
        } else if (num >= 10 && num < 20) {
            s = base3[num % 10];
        } else if (num >= 20 && num < 100) {
            s = base2[num / 10] + " " + base1[num % 10];
        } else if (num >= 100 && num < 1000) {
            s = base1[num / 100] + " hundred " + base2[num / 10 % 10] + " " + base1[num % 10];
        } else if (num >= 1000 && num < 10000) {
            s = base1[num / 1000] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        }  else if (num >= 10000 && num < 100000) {
                s = base2[num / 10000] + "  " + base1[(num / 1000) % 10] + " thousand " + base2[(num / 10) % 10] + " " + base1[num % 10];
        }  else if (num >= 100000 && num < 1000000) {
            s = base1[num / 100000] + " hundred " + base2[(num / 10000) % 10] + " " + base1[num % 10] + " thousand " + base1[(num / 10) % 10] + " hundred " + base2[num % 10] + " " + base1[num % 10];
        } else {
            System.out.println("num out of range");
            return;
        }

        System.out.println(s);
    }
    public static void printUpwardTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printDownwardTriangle() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printLeftTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRightTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
