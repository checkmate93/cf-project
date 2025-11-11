package gr.aueb.cf.ch10;

public class Student {
    private static int studentCount = 0;
   private int  id;
   private String firstname;
   private   String lastname;



    public Student(){
        studentCount++;

    }

    public Student(int id , String firstname , String lastname){
        this.id= id;
        this.firstname = firstname;
        this.lastname = lastname ;
        studentCount++;

    }

    public static int getStudentCount(){
        return studentCount;
    }





   public int getId() {
       return id;
   }

   public void setId(int id){
       this.id=id;
   }

   public String getFirstname(){
       return firstname;
   }

   public void setFirstname(String firstname){
       this.firstname=firstname;
   }
    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lasstname){
        this.lastname=lastname;
    }





}
