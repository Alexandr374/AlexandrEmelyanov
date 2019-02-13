class Plate {
    int food;
    Plate(int food){
        this.food = food;
    }
    void info(){
        System.out.println("В тарелке: " + food);
    }
    void decreaseFood(int n){
        food -= n;
    }
    void increaseFood(int x){
        food += x;
    }
}
