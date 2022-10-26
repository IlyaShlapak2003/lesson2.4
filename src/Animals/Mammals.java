package Animals;

import Animals.Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private float travelSpeed;
    public Mammals(String name, int age, String livingEnvironment, float travelSpeed) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "неизвестно";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (travelSpeed<=0){
            this.travelSpeed=10;
        }
        else {
            this.travelSpeed=travelSpeed;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "неизвестно";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void setTravelSpeed(float travelSpeed) {
        if (travelSpeed<=0){
            this.travelSpeed=10;
        }
        else {
            this.travelSpeed=travelSpeed;
        }
    }

    public float getTravelSpeed() {
        return travelSpeed;
    }
    public void walk(){
        System.out.println("Я гуляю по "+livingEnvironment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Float.compare(mammals.travelSpeed, travelSpeed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed=" + travelSpeed +
                '}';
    }
}
