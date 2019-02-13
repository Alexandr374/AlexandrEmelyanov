import java.util.Scanner;

public class Main {
    private static Cat[] catArray = new Cat[4];

    public static void main(String[] args) {
        int inPutNum;
        Scanner scanFood = new Scanner(System.in);
        Cat cat = new Cat("Барсик", 25, false);
        Plate plate = new Plate(55);
        plate.info();
        catArray[0] = new Cat("Барсик", 25, false);
        catArray[1] = new Cat("Кузя", 15, false);
        catArray[2] = new Cat("Тоша", 35, false);
        catArray[3] = new Cat("Гномик", 40, false);

        for(int i = 0; i < catArray.length; i++){
            if(plate.food > catArray[i].appetite && !catArray[i].fullness){
                catArray[i].eat(plate);
                catArray[i].fullness = true;
                System.out.println("Кот " + catArray[i].name + " покушал!");
                plate.info();
                System.out.println();
            }else {
                System.out.println("Кажется кто-то не поел! в тарелке оказалось мало еды!");
                System.out.println("Сколько корма еще положить?");
                inPutNum = scanFood.nextInt();
                plate.increaseFood(inPutNum);
                plate.info();
                catArray[i].eat(plate);
                catArray[i].fullness = true;
                System.out.println("Кот " + catArray[i].name + " теперь тоже покушал!");
                plate.info();
            }
            System.out.println("Все наелись!!!");
        }

    }
}
