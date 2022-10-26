package Animals;

import java.util.Objects;

public class Flying extends Birds{
    private String typeOfMovement;
    private String typeOfFood;
    private int timeOfSleep;
    public Flying(String name, int age, String livingEnvironment, String typeOfFood, String typeOfMovement, int timeOfSleep ) {
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
        System.out.println("Я перемещаюсь по "+getLivingEnvironment());
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю "+ getTimeOfSleep()+" часов");
    }

    @Override
    public void hunt() {
        System.out.println("Я взлетаю и ищу добычу");
        System.out.println("Нахожу цель и нападаю");
        System.out.println("Поймав цель я убиваю ее и ем");
    }
    public void fly(){
        System.out.println("Готовлюсь к полету");
        System.out.println("Взлетаю маша крыльями");
        System.out.println("Ловлю ветер и парю, помогая крыльями");

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
        Flying flying = (Flying) o;
        return timeOfSleep == flying.timeOfSleep && Objects.equals(typeOfMovement, flying.typeOfMovement) && Objects.equals(typeOfFood, flying.typeOfFood);
    }

    @Override
    public String toString() {
        return "Flying{" +"name='" + getName() + '\'' +
                ", age=" + getAge() +" livingEnvironment='" + getLivingEnvironment() + '\'' +
                "typeOfMovement='" + typeOfMovement + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", timeOfSleep=" + timeOfSleep +
                '}';
    }
}
