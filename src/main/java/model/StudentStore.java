package model;

public interface StudentStore {

    String getStudents();
    Student getStudent(int id);
    int addStudent(Student student);
    int deleteStudent(int id);

}
