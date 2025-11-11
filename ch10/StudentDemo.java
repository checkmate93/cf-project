package gr.aueb.cf.ch10;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student Alice  = new Student(2 , "Alice" , "H.");
        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("W.");
        
        System.err.println("ιδ"+student.getId());
        System.err.println("Firstname " +student.getFirstname());

    }
}
