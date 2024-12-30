/* Print numbers from 1 to 10 using a do-while loop. */
class PrintNum {
    private int num;

    public void printNum() {
        num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}

public class twentyfour {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        printNum.printNum();
    }
}
