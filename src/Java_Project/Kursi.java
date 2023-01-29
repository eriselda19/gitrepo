package src.Java_Project;

public class Kursi {
    public String Emer;
    public String studentName;
    public int studentNr=0;

    public Kursi(String Emer){
        this.Emer=Emer;
    }

    public int shtoStudent(String studentName){
        this.studentName=studentName;
        return studentNr++;

    }

    public String getStudent(){
        return studentName;
    }

    public int getNumriStudenteve(){
        return studentNr;
    }
}
