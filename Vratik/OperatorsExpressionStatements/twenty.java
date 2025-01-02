/* Write a program to find the position of the highest set bit in a number. */
class SetBit {
    private int num;

    public SetBit(int num) {
        this.num = num;
    }

    public int findPosition() {
        int position = 0;
        while (num > 0) {
            num = num >> 1;
            position++;
        }
        return position;
    }
}

public class twenty {
    public static void main(String[] args) {
        SetBit setBit = new SetBit(20);
        System.out.println("Position of highest set bit is: " + setBit.findPosition());
    }
}
