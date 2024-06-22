package Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("E1");
        subjects.add("E2");
        subjects.add("E3");
        return this;
    }
}
