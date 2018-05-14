package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentStoreLocal implements StudentStore{

    private Map<Integer, Student> students;

    public StudentStoreLocal() {
        students = new HashMap<Integer, Student>();
    }

    public String getStudents() {
        return students.values().toString();
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public int addStudent(Student student) {
        if(students.containsKey(student.getId()))
            return 0;
        else
            students.put(student.getId(), student);
        return 1;
    }

    public int deleteStudent(int id) {
        if(!students.containsKey(id))
            return 0;
        else
            students.remove(id);
        return 1;
    }
}