package src.Java_Project;

public class TestKursi {
    public static void main(String[] args) {
        Kursi kursi1=new Kursi("GjeoInfo");
        Kursi kursi2=new Kursi("Informatike");
        kursi1.shtoStudent("Eneida");
        kursi1.shtoStudent("Alda");
        kursi1.shtoStudent("Selda");
        kursi2.shtoStudent("Eneida");
        kursi2.shtoStudent("Eneida");
        kursi2.shtoStudent("Eneida");
        System.out.println(kursi1.getNumriStudenteve());
        System.out.println(kursi2.getNumriStudenteve());

    }
}
