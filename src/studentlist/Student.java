package studentlist;

/**
 * SYST17796 Fundamentals of Software Design and Development
 * @author Joshua Abeto
 */

//added comments for pull operation
public class Student {
    private int studentNum;
    private String studentNames;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
