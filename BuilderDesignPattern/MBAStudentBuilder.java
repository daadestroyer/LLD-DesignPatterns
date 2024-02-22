package BuilderDesignPattern;

import java.util.Arrays;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjectList() {
        List<String> sub = Arrays.asList("SUB1", "sss", "sss");
        this.subjectList = sub;
        return this;
    }
}
