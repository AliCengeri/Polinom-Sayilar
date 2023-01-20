public class Main {
    static boolean isPalindrom(int num) {
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

        return true;
    }

    public static void main(String[] args) {
        isPalindrom(121);
    }
}