package BuilderDesignPattern;

import java.util.List;

public class Student {
    String name;
    int rollNumber;
    int age;
    String fatherName;
    String motherName;

    List<String> subjectList;
    String mobileNumber;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjectList = studentBuilder.subjectList;
        this.mobileNumber = studentBuilder.mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjectList=" + subjectList +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
