package entity;

import enums.Direction;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Direction directions;
    private String name;
    private int minCapacity;
    private Student[] students;
    private int duration;
    private Teacher mainTeacher;
    private Teacher supportTeacher;
    private LocalDate startDate;
    private StudentGrade[] studentGrade;

    public Group(Direction directions, String name, int duration, Teacher mainTeacher, int minCapacity) {
        this.minCapacity = minCapacity;
        this.directions = directions;
        this.name = name;
        this.duration = duration;
        this.mainTeacher = mainTeacher;
    }

    public Direction getDirections() {
        return directions;
    }

    public void setDirections(Direction directions) {
        this.directions = directions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Teacher getMainTeacher() {
        return mainTeacher;
    }

    public void setMainTeacher(Teacher mainTeacher) {
        this.mainTeacher = mainTeacher;
    }

    public Teacher getSupportTeacher() {
        return supportTeacher;
    }

    public void setSupportTeacher(Teacher supportTeacher) {
        this.supportTeacher = supportTeacher;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public StudentGrade[] getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(StudentGrade[] studentGrade) {
        this.studentGrade = studentGrade;
    }

    public  void  addStudents(Student[] students) {
        if (this.students == null) {
            this.students = new Student[0];
        }
        Student[] newStudents = new Student[this.students.length + students.length];
        System.arraycopy(this.students, 0, newStudents, 0, this.students.length);
        System.arraycopy(students, 0, newStudents, this.students.length, students.length);
        this.students = newStudents;
    }

    public  void  addStudentsFor(Student[] students) {
        if (this.students == null) {
            this.students = new Student[0];
        }
        for (Student student : students) {
            addStudents(students);
        }
    }

    public void addStudent(Student student) {
        if (this.students == null) {
            this.students = new Student[0];
        }
        Student[] newStudents = new Student[this.students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = student;
        this.students = newStudents;
    }

    public void deleteStudent(int i) {
        if (this.students == null) {
            this.students = new Student[0];
        } else {
            Student[] newStudents = new Student[this.students.length - 1];
            int t = 0;
            if (this.students.length - 1 >= i && i >= 0) {
                for (int j = 0; j < this.students.length; j++) {
                    if (i != j) {
                        newStudents[t++] = students[i];
                    }
                }
                this.students = newStudents;
            }

        }
    }

    public void startLesson() {
        this.startDate = LocalDate.now();
    }

    public LocalDate getEndDate() {
        return this.startDate.plusMonths(this.duration);
    }
    public void showStudents(Student student) {
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + " - " + this.students[i].toString());
        }
    }

    public boolean isActive() {
        return students.length >= minCapacity;

    }

    @Override
    public String toString() {
        return "Group{" +
                "directions=" + directions +
                ", name='" + name + '\'' +
                ", minCapacity=" + minCapacity +
                ", students=" + Arrays.toString(students) +
                ", duration=" + duration +
                ", mainTeacher=" + mainTeacher +
                ", supportTeacher=" + supportTeacher +
                ", startDate=" + startDate +
                ", studentGrade=" + Arrays.toString(studentGrade) +
                '}';
    }
}

class StudentGrade {

    private Student student;
    private double grade;

    public StudentGrade(Student student, double grade) {
        this.student = student;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "student=" + student +
                ", grade=" + grade +
                '}';
    }
}
