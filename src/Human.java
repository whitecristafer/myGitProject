public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.printf("Name: %s%nAge: %d",name,age);
    }
}
