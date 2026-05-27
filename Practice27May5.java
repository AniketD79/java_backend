import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{

   int id;
    String name;
     int marks;

     Student(int id,
    String name,
     int marks){
        this.id= id;
        this.name= name;
        this.marks= marks;
        
     }
     @Override
     public String toString(){
return "[Student: " +"ID: "+id+" Name: "+name+" Marks: "+marks+ "]";
     }
}

public class Practice27May5 {
    public static  void main(String[] args) {
        Student s1= new Student(1, "Aniket", 100);
        Student s2= new Student(2, "Bunny", 91);
        Student s3= new Student(3, "Abc", 65);
        Student s4= new Student(4, "Xyz", 75);
Comparator c = new Comparator<Student>() {

    @Override
    public int compare(Student a, Student b) {
        // TODO Auto-generated method stub
       return a.marks-b.marks;

    // a-b so 1 to 10 ascending order
    // b-a so 10 to 1 descending order
    }
    
};
        List<Student> students = new ArrayList<>(List.of(s1,s2,s3,s4));
        // students.stream().filter(stud-> stud.marks> stud.marks)
        // students.sort((a,b)->a.marks - b.marks);
        students.sort(c);
        students.forEach(System.out::println);
    }
}
