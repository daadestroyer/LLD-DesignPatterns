package BuilderDesignPattern;

import java.util.Arrays;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjectList() {
        List<String> strings = Arrays.asList("DBMS", "JAVA", "OS");
        this.subjectList = strings;
        return this;
    }
}
