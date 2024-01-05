import entity.Group;
import entity.Student;
import entity.Teacher;
import enums.Direction;
import enums.Gender;

public class Main {
    public static void main(String[] args) {


        Teacher teacher = new Teacher("Abdulhay", 24, Gender.MALE, new Direction[]{Direction.JAVA}, 3);

        Student student = new Student("Ahmadillo", 21, Gender.MALE);
        Student studen2 = new Student("Asilbek", 21, Gender.MALE);
        Group group = new Group(Direction.JAVA, "N3", 8, teacher, 9);
        group.addStudents(new Student[]{student, studen2});
        group.showStudents(student);
        System.out.println();
        System.out.println(group.toString());
        group.deleteStudent(0);
        System.out.println();
        group.showStudents(student);


 }

}