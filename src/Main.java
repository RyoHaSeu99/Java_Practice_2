class Person {
    String name;
    int age; // 필드(클래싀 안의 변수)
    String mbti;

    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는 " + age + "살이고 mbti는 " + mbti + "입니다.");

    }
    public void work() {
            System.out.println("일하는 중...");

    }
}

class Car {
    String brand;
    int year;

    public void displayinfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("연식: " + year);
    }
}



public class Main {
    public static void main(String[] args) {
        Person person = new Person();   // 객체(=인스턴스)

        person.name = "한철규";
        person.age = 27;
        person.mbti = "istp";

        person.sayHello();

        person.work();

        Person mzPerson = new Person();
        mzPerson.name = "신태희";
        mzPerson.age = 24;
        mzPerson.mbti = "isfj";

        mzPerson.sayHello();
        mzPerson.work();

        Car myCar = new Car();

        myCar.brand = "현대";
        myCar.year = 18;

        myCar.displayinfo();

    }
}