import java.util.*;

public class DeepCopyConstructor {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        // Student s2 = new Student("Shubham Khalane");
        // Student s3 = new Student(123);
        // System.out.println(s1.name);
        s1.name = "Shubham Khalane";
        s1.roll = 456;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.password = "xyz";
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

         class Student{
        String name; 
        int roll;
        String password;
        int marks;

        // Shallow Copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
        }

        // Deep Copy Constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
    
        }

    }
}

    // class Student{
    //     String name; 
    //     int roll;
    //     String password;
    //     int marks;

    //     // Shallow Copy constructor
    //     // Student(Student s1){
    //     //     marks = new int[3];
    //     //     this.name = s1.name;
    //     //     this.roll = s1.roll;
    //     //     this.marks = s1.marks;
    //     // }

    //     // Deep Copy Constructor
    //     Student(Student s1){
    //         marks = new int[3];
    //         this.name = s1.name;
    //         this.roll = s1.roll;
    //         this.marks = s1.marks;
    
    //     }
    // }
        