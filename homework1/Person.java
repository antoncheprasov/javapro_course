package homework1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        fullName = "";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("John Jay", 22);
        person2.move();
        person2.talk();
    }
}
