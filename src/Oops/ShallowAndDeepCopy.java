package Oops;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
       Student s1 =new Student(); 
       s1.name="asdd";
       s1.roll_no=123;
       s1.marks[0]=12;
       s1.marks[1]=20;
       s1.marks[2]=28;
       
    }
}
class Student{
    String name;
    int roll_no;
    int marks[]=new int[3];
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
       this.marks=s1.marks;
    }
}
