package BuilderDesignPattern.Problem;

import java.util.List;
/*
1. Let’s suppose we have one Student class in that we have only 1 mandatory field and other are optional field
2. Then in this case how can we build object because on constructor we want to pass only mandate field but forcefully we need to pass other field also
3. so one solution we can do is to create some other constructors which contains only mandate field
 */
public class Student {
    int rollNumber; // mandatory field
    int age; // optional field
    String name; // optional field
    String fatherName; // optional field
    String motherName; // optional field
    List<String> subject; // optional field
    String mobileNumber; // optional field

    // constructor which have mandate and optional field
    public Student(int rollNumber, int age, String name, String fatherName, String motherName, List<String> subject, String mobileNumber) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subject = subject;
        this.mobileNumber = mobileNumber;
    }

    // constructor which have only mandated field, and similarly we can have multiple cases
    public Student(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public Student(int rollNumber,int age) {
        this.rollNumber = rollNumber;
        this.age = age;
    }

}
