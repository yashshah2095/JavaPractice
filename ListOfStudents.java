import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStudents {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Yash",70));
        studentList.add(new Student("Raj",72));
        studentList.add(new Student("Rahul",81));
        studentList.add(new Student("Het",90));
        studentList.add(new Student("Sagar",61));
        List<Student> filteredStudents=studentList.stream().filter((el)->el.getScore()>80).collect(Collectors.toList());
        System.out.println(filteredStudents);
    }
}
