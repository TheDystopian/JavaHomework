package snus.bebra.anonimus.two.dog;

public class Dog {
    private String breed;
    private short age;

    Dog (String breed, short age) {
        this.age = age;
        this.breed = breed;
    }

    public short getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int toHumanYears() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", humanYears=" + this.toHumanYears() +
                '}';
    }
}
