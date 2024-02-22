package BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else{
            return createMBAStudent();
        }
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setAge(22).setName("shubham").build();
    }
    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(122).setFatherName("pankaj").build();
    }
}
