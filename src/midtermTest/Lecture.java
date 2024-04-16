package midtermTest;

public class Lecture {
    String lectureName;
    Student[] students;
    int currentCount;

    void insertStudent(String name, String studentNo, int seatNo) {
        students[seatNo - 1].setName(name);
        students[seatNo - 1].setStudentNo(studentNo);
    }
}
