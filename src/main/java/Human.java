public class Human implements Prototype {

    // КЛАСС РЕАЛИЗУЮЩИЙ ИНТЕРФЕЙС PROTOTYPE

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object copy() {
        Human copy = new Human(age, name);
        System.out.println("Копия создана");
        return copy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object human) {

        Human human1 = (Human) human;

        if ((human1.getAge() == this.getAge() && human1.getName() == this.getName())) {

            return true;
        } else return false;


    }
}
