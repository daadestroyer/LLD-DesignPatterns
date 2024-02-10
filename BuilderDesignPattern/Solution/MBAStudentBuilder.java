package BuilderDesignPattern.Solution;

import java.util.Arrays;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subject = Arrays.asList("Business Studies", "Micro Economics", "Operations");
        this.subject = subject;
        return this;
    }
}
