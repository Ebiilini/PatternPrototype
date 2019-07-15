public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human(19,"Sasha");
        System.out.println(hum1);
        Human hum1Copy = (Human) hum1.copy();
        System.out.println(hum1Copy);
        HumanFactory factory = new HumanFactory(hum1);
        Human factoryHuman = factory.makeCopy();
        System.out.println(factoryHuman );
        factory.setPrototype(new Human(30,"dasha"));
        Human h12 = new Human(10,"dafa");
        Human h21 = new Human(hum1.getAge(),hum1.getName());
        System.out.println(h21);



    }
}
