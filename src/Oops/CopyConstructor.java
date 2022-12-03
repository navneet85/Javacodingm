package Oops;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rahul";
        s1.roll_no=113;
        s1.password="abce";
        Student s2=new Student(s1);
        s2.password="abcd123";
    }
}
class Student{
    String name;
    int roll_no;
    String password;
    Student(){   
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll_no){
        this.roll_no=roll_no;
    }
    Student(Student s1){
      this.name=s1.name;
      this.roll_no=s1.roll_no;
    }
}
