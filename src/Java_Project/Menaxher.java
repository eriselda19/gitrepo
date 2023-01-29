package src.Java_Project;

public class Menaxher extends Personel{

    public float bonus;

    public Menaxher(){

    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Menaxher{" +
                "bonus=" + bonus +
                '}';
    }


}
