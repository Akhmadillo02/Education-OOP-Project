package entity;

import enums.Direction;
import enums.Gender;

import java.util.Arrays;

public class Teacher extends Person {

    private Direction[] directions;
    private Group[] groups;
    private int experience;

    public Teacher(String name, int age, Gender gender, Direction[] directions, int experience) {
        super(name, age, gender);
        this.directions = directions;
        this.experience = experience;
    }

    public Direction[] getDirections() {
        return directions;
    }

    public void setDirections(Direction[] directions) {
        this.directions = directions;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "directions=" + Arrays.toString(directions) +
                ", groups=" + Arrays.toString(groups) +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
