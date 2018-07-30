public class PersonTest {
    public static void main(String[] args) {
        Person name = new Person();

        name.setName("Mando");
        name.sayHello();

        Person employee = new Person();
        employee.setName("Gisela");
        employee.sayHello();
    }
}
