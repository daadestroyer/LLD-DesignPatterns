package BuilderDesignPattern.Solution;

public class Parents {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineerStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engnieerStudent = director1.createStudent();
        Student mbaStudent = director2.createStudent();
        System.out.println(engnieerStudent);
        System.out.println(mbaStudent);
    }
}
