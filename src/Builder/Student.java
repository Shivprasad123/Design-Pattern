package Builder;

import java.util.List;

public class Student {
    int rollNo;
    int age;
    String name;
    List<String> subjects;

    public Student(StudentBuilder sb){
        this.rollNo = sb.rollNo;
        this.age = sb.age;
        this.name = sb.name;
        this.subjects = sb.subjects;
    }
}
