public class Main {
    public static void main(String[] args) {
        int number = 123;
        String binartString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);

        System.out.println("십진수: " + number);
        System.out.println("이진수: " + binartString);
        System.out.println("십육진수: " + hexString);
    }
}