package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student1 = new Student(4, "Makis", "Kapetis");
        student1.setFirstname("Xrisostomos");

//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1);     //setter
        alice.setFirstname("Alice");  //getter
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstname(), alice.getLastname());

        System.out.println(Student.getStudentsCount());
    }
}
