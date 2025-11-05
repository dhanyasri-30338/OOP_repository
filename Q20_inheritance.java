package multilevel_inheritance;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Student extends Person {
    String studentID;

    Student(String name, int age, String studentID) {
        super(name, age); 
        this.studentID = studentID;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentID);
    }
}


class GraduateStudent extends Student {
    String thesisTitle;

    GraduateStudent(String name, int age, String studentID, String thesisTitle) {
        super(name, age, studentID); 
        this.thesisTitle = thesisTitle;
    }

    void submitThesis() {
        System.out.println(name + " submitted thesis: " + thesisTitle);
    }
}


public class Q20_inheritance {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Dhanya", 18, "338", "OOPS java");

        gs.displayInfo();     
        gs.submitThesis();   
    }
}