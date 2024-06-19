package Pracetice_7주차;

public class Example {
    private static Student[] students = {
            new Student("Mike", 90, 96),
            new Student("Maria", 94, 92)
    };

    public static double avg(Function<Student> function) {
        double sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        return sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore); // 메소드 참조로 수정
        System.out.println("English average: " + englishAvg);

        double mathAvg = avg(Student::getMathScore); // 메소드 참조로 수정
        System.out.println("Math average: " + mathAvg);
    }
}
