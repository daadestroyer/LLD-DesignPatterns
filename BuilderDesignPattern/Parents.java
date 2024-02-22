package BuilderDesignPattern;

public class Parents {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudentBuilder());
        Student student = director.createStudent();
        System.out.println(student);

        Director director1 = new Director(new MBAStudentBuilder());
        Student student1 = director1.createStudent();
        System.out.println(student1);
    }
}
