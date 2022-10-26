package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;
    private int timeOfSleep;

    public Amphibians(String name, int age, String livingEnvironment, int timeOfSleep) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "неизвестно";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (timeOfSleep < 0) {
            this.timeOfSleep = 0;
        } else {
            this.timeOfSleep = timeOfSleep;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
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
    public void eat() {
        System.out.println("Я ем насекомых");
    }

    public void hunting() {
        System.out.println("Выхожу на охоту");
        System.out.println("Ловлю насекомое");
        System.out.println("Ем добычу");
    }

    @Override
    public void move() {
        if (livingEnvironment.equals("суша")) {
            System.out.println("Я перемещаюсь по суше");
        } else if (livingEnvironment.equals("вода")) {
            System.out.println("Я перемещаюсь в воде");
        } else {
            System.out.println("НЕИЗВЕСТНО");
        }
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю "+timeOfSleep+" часов");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return timeOfSleep == that.timeOfSleep && Objects.equals(livingEnvironment, that.livingEnvironment);
    }


    @Override
    public String toString() {
        return "Amphibians{" +"name='" + getName() + '\'' +
                ", age=" + getAge() +
                " livingEnvironment='" + livingEnvironment + '\'' +
                ", timeOfSleep=" + timeOfSleep +
                '}';
    }
}
