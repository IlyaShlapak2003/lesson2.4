package Animals;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Укажите имя";
        } else {
            this.name = name;
        }
        if (age == 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public abstract void eat();
    public abstract void move();
    public abstract void sleep();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
