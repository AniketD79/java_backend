import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
    String name;
    int marks;
    Student( int id,
    String name,
    int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
        
    }
}

public class Practice27May4 {
    public static void main(String[] args) {
       Student s1 = new Student(1, "Aniket", 100);
       Student s2 = new Student(2, "Bunny", 91);
       Student s3 = new Student(3, "Abc", 70);
       Student s4 = new Student(4, "Xyz", 60);


        List<Student> studs = new ArrayList<>(List.of(s1,s2,s3,s4));
        studs.forEach(stud->System.out.println("ID: "+stud.id +" Name: "+ stud.name + " Marks: "+stud.marks ));
        // studs.forEach(stud->System.out.println("ID: "+stud.id +" Name: "+ stud.name + " Marks: "+stud.marks ));

        System.out.println("Students with marks greater than 80: ");
       List<Student> students=  studs.stream().filter(stud -> stud.marks >80).toList();
       students.forEach(stud->System.out.println("ID: "+stud.id +" Name: "+ stud.name + " Marks: "+stud.marks ));
       students.forEach(stud->System.out.println(stud.toString()));
    }
    
}
