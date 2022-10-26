package Animals;

import java.util.Objects;

public class Flightless extends Birds{
    private String typeOfMovement;
    private String typeOfFood;
    private int timeOfSleep;
    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement, int timeOfSleep, String typeOfFood) {
        super(name, age, livingEnvironment);
        if (typeOfMovement== null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()){
            this.typeOfMovement="НЕИЗВЕСТНО";
        }
        else {
            this.typeOfMovement=typeOfMovement;
        }
        if (timeOfSleep < 0) {
            this.timeOfSleep = 0;
        } else {
            this.timeOfSleep = timeOfSleep;
        }
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = "НЕИЗВЕСТНО";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public void eat() {
        System.out.println("Я ем "+getTypeOfFood());

    }

    @Override
    public void move() {
        System.out.println("Я гуляю по "+getLivingEnvironment());

    }//метод перемещаться = методу гулять

    @Override
    public void sleep() {
        System.out.println("Я сплю "+ getTimeOfSleep()+" часов");
    }

    @Override
    public void hunt() {
        System.out.println("Выхожу на охоту");
        System.out.println("Ловлю и ем "+typeOfFood);


    }

    public String getTypeOfMovement() {
        return typeOfMovement;
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
        if (timeOfSleep < 0) {
            this.timeOfSleep = 0;
        } else {
            this.timeOfSleep = timeOfSleep;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return timeOfSleep == that.timeOfSleep && Objects.equals(typeOfMovement, that.typeOfMovement) && Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public String toString() {
        return "Flightless{" +"name='" + getName() + '\'' +
                ", age=" + getAge() +" livingEnvironment='" + getLivingEnvironment() + '\'' +
                " typeOfMovement='" + typeOfMovement + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", timeOfSleep=" + timeOfSleep +
                '}';
    }
}
