package midtermTest;

public class Student {
    private String name;
    private int studentNo;
    private String studentNoString;

    String getName() {
        return name;
    }

    String getStudentNo() {
        return studentNoString;
    }

    void setName(String setName) {
        this.name = setName;
    }

    // 학번 설정 (문자열 형태의 학번을 정수와 문자열 필드에 저장)
    void setStudentNo(String studentNoString) {
        this.studentNoString = studentNoString;
        // "2020-0000" 문자열에서 '-'를 제거하여 "20200000" 형태로 변환
        this.studentNo = Integer.parseInt(studentNoString.replace("-", ""));
    }

    // 학번이 일치하는지 검사 (문자열 필드만 사용)
    boolean isStudentNoMatched(String checkStudentNo) {
        if (studentNoString == null) return false;
        return studentNoString.equals(checkStudentNo);
    }

    boolean isNameMached(String checkName) {
        if (name == null) return  false;
        else return name.equals(checkName);
    }

    void delete() {
        name = null;
        studentNo = 0;
        studentNoString = null;
    }
}
