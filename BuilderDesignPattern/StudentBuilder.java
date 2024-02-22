package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    String name;
    int rollNumber;
    int age;
    String fatherName;
    String motherName;

    List<String> subjectList;
    String mobileNumber;



    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;

    }

    public abstract StudentBuilder setSubjectList();

    public StudentBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
