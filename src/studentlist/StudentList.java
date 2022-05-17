package studentlist;

/**
 * SYST17796 Fundamentals of Software Design and Development
 * @author Joshua Abeto
 */
public class StudentList {

    public static void main(String[] args) {
        
        Student s1 = new Student(1, "Joshua");
        Student s2 = new Student(2, "Abeto");
        Student s3 = new Student(3, "abc");
        
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        
        System.out.println(studentList[1].getStudentNum());
        System.out.println(studentList[2].getStudentNames());
    }
}
