package BuilderDesignPattern.Solution;

import java.util.List;

/*
1. solution is to just create a constructor that contains StudentBuilder object
 */
public class Student {
    int rollNumber; // mandatory field
    int age; // optional field
    String name; // optional field
    String fatherName; // optional field
    String motherName; // optional field
    List<String> subject; // optional field
    String mobileNumber; // optional field


    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.mobileNumber = studentBuilder.mobileNumber;
        this.subject = studentBuilder.subject;
        this.mobileNumber = studentBuilder.mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subject=" + subject +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
