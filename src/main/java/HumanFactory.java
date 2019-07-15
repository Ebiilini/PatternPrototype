public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
        // конструктор с аргументом Human
    }


    public void setPrototype(Human human){
        this.human = human;
        // метод получающий экземпляр конкретного класса

    }
    public Human makeCopy(){
        return (Human) human.copy();
        // копирование полученного экземпляра
    }
}
