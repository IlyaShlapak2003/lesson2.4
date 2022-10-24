package Animals;

import Animals.Animals;

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
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed=" + travelSpeed +
                '}';
    }
}
