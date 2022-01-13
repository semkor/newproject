package lesson6_34.lesson8A;

public class Student {
    String firstName;
    String lastName;
    int group;
    int age;
    Course[] coursesTaken;

    public  Student(String firstName, String lastName, int group, Course[] coursesTaken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.coursesTaken = coursesTaken;
    }
}
