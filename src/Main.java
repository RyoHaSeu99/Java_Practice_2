public class Main {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        System.out.println("문자열 길이: " + message.length());

        System.out.println("대문자 변환: " + message.toUpperCase());
        System.out.println("소문자 변환: " + message.toLowerCase());

        System.out.println("J의 인덱스: " + message.indexOf("J"));
        System.out.println("중복된 글자 인덱스: " + message.indexOf("l") + ", " + message.indexOf("a"));

        for (int i = 0; i < message.length(); i ++) {
            if(message.charAt(i) == 'a') {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= message.length(); i++) {
            System.out.println(message.substring(i));

        }

        System.out.println(message.substring(3, 4));

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";

        System.out.println(address.substring(0, 7).equals("0x12081"));

        System.out.println(address.substring(address.length() - 5));
        System.out.println(
                address.substring(0, 7)
                + "..."
                + address.substring(address.length() - 5)
        );

    }
}