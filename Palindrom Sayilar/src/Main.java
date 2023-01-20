public class Main {
    static void isPalindrom(int num) {
        int tempNum = num, reverseNum = 0, lastNum;
        while (tempNum != 0) {
            lastNum = tempNum % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            tempNum /= 10;
        }
        if (reverseNum == num) {
            System.out.println(num + " Bir polindrom sayıdır.");
        }else {
            System.out.println(num + " Bir polindrom sayı değildir.");}
    }

    public static void main(String[] args) {
        isPalindrom(123);
    }
}