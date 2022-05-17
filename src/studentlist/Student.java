package studentlist;

/**
 * SYST17796 Fundamentals of Software Design and Development
 * @author Joshua Abeto
 */
public class Student {
    private int studentNum;
    private String studentNames;

    public Student(int studentNum, String studentNames) {
        this.studentNum = studentNum;
        this.studentNames = studentNames;
    }
    
    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String studentNames) {
        this.studentNames = studentNames;
    }
    
}
