package Builder;

import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    int age;
    String name;
    List<String> subjects;

    public StudentBuilder setRollNo(int rn){
        this.rollNo = rn;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
