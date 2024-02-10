package BuilderDesignPattern.Solution;

import BuilderDesignPattern.Problem.Student;

import java.util.Arrays;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subject = Arrays.asList("DSA", "OS", "JAVA", "DBMS", "C++");
        this.subject = subject;
        return this;
    }
}
