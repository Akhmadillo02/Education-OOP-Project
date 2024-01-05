package entity;

import enums.Gender;

import java.util.Arrays;

public class Student extends Person {

    private Group[] groups;


    public Student(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void showDirections() {
        for (Group group : groups) {
            System.out.println(group.getDirections());

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "groups=" + Arrays.toString(groups) +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
