package Animals;

import java.util.Objects;

public class Predators extends Mammals{
    private String typeOfFood;
    private int timeOfSleep;
    public Predators(String name, int age, String livingEnvironment, float travelSpeed, String typeOfFood, int timeOfSleep) {
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

    public int getTimeOfSleep() {
        return timeOfSleep;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = "НЕИЗВЕСТНО";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void setTimeOfSleep(int timeOfSleep) {
        if (timeOfSleep < 0) {
            this.timeOfSleep = 0;
        } else {
            this.timeOfSleep = timeOfSleep;
        }
    }

    @Override
    public void eat() {
        System.out.println("Я охочусь на "+getTypeOfFood());
    }

    @Override
    public void move() {
        System.out.println("Я гуляю по "+getLivingEnvironment());
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю "+getTimeOfSleep()+" часов");
    }
    public void hunt(){
        System.out.println("Выхожу на охоту");
        System.out.println("Ищу добычу и осторожно подкрадываюсь");
        System.out.println("Неожиданно нападаю на жертву, убиваю и съедаю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return timeOfSleep == predators.timeOfSleep && Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", timeOfSleep=" + timeOfSleep +
                '}';
    }
}
