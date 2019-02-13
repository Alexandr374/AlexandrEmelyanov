class Cat{
    String name;
    int appetite;
    boolean fullness;
    Cat(String name, int appetite, boolean fullness){
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    void eat(Plate p){
        p.decreaseFood(appetite);
    }
}
