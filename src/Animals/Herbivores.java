package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;
    private int timeOfSleep;

    public Herbivores(String name, int age, String livingEnvironment, float travelSpeed, String typeOfFood, int timeOfSleep) {
        super(name, age, livingEnvironment, travelSpeed);
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = "НЕИЗВЕСТНО";
        } else {
            this.typeOfFood = typeOfFood;
        }
        if (timeOfSleep < 0) {
            this.timeOfSleep = 0;
        } else {
            this.timeOfSleep = timeOfSleep;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = "НЕИЗВЕСТНО";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public int getTimeOfSleep() {
        return timeOfSleep;
    }

    public void setTimeOfSleep(int timeOfSleep) {
        if (timeOfSleep <= 0) {
            this.timeOfSleep = 1;
        } else {
            this.timeOfSleep = timeOfSleep;
        }
    }

    @Override
    public void eat() {
        System.out.println("Я питаюсь " + typeOfFood);
    }

    @Override
    public void move() {
        System.out.println("Я гуляю по "+getLivingEnvironment());
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю "+getTimeOfSleep()+" часов");
    }
    public void graze(){
        System.out.println("Выхожу на пастбище");
        System.out.println("Ем "+typeOfFood);
        System.out.println("Ухожу с пастбища");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return timeOfSleep == that.timeOfSleep && Objects.equals(typeOfFood, that.typeOfFood);
    }



    @Override
    public String toString() {
        return "Herbivores{" +"name='" + getName() + '\'' +
                ", age=" + getAge() +
                " livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", travelSpeed=" + getTravelSpeed() +
                " typeOfFood='" + typeOfFood + '\'' +
                ", timeOfSleep=" + timeOfSleep +
                '}';
    }
}
