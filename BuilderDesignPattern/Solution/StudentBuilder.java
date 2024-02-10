package BuilderDesignPattern.Solution;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber; // mandatory field
    int age; // optional field
    String name; // optional field
    String fatherName; // optional field
    String motherName; // optional field
    List<String> subject; // optional field
    String mobileNumber; // optional field

    public StudentBuilder setRollNumber(int rollNumber) {this.rollNumber = rollNumber;return this;}

    public StudentBuilder setAge(int age) {this.age = age;return this;}

    public StudentBuilder setName(String name) {this.name = name;return this;}

    public StudentBuilder setFatherName(String fatherName) {this.fatherName = fatherName;return this;}

    public StudentBuilder setMotherName(String motherName) {this.motherName = motherName;return this;}

    public StudentBuilder setMobileNumber(String mobileNumber) {this.mobileNumber = mobileNumber;return this;}

    abstract public StudentBuilder setSubjects();

    public Student build() {return new Student(this);}
}
