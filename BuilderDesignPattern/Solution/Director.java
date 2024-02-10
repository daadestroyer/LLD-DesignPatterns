package BuilderDesignPattern.Solution;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineerStudentBuilder) {
            return createEngineerStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineerStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("shubham").setSubjects().build();
    }

    private Student createMBAStudent() {
        Student student = studentBuilder.setRollNumber(2).setAge(25).setName("ram").setFatherName("fathername").setMobileNumber("mothername").setSubjects().build();
        return student;
    }
}
