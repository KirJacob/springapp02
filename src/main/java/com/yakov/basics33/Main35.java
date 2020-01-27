package com.yakov.basics33;

//ANONYMOUS CLASSES
class AnimalTwo{
    public void eat() {
        System.out.println("Animal is eating ...");
    }
}

class OtherAnimal extends AnimalTwo {
    @Override
    public void eat() {
        System.out.println("Other animal is eating ...");
    }
}

class Test35 {
    public static void main(String[] args) {
        AnimalTwo animalTwo = new AnimalTwo();
        animalTwo.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();

        AnimalTwo animalTwo1 = new AnimalTwo(){
            //ITS an ANONYMOUS CLASS which is extended from AnimalTwo
            @Override
            public void eat(){
                System.out.println("Eating from Anonymous class");
            }
        };
        animalTwo1.eat();

        //SAMPLE2
    }
}

interface AbleToEat {
    public void eatInt();
}

//class AnimalThree implements AbleToEat {
//    @Override
//    public void eatInt(){
//        System.out.println("Eating now ... ");
//    }
//}

public class Main35 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat(){
            @Override
            public void eatInt(){
                System.out.println("Eating now ... ");
            }
        };
        ableToEat.eatInt();

    }
}
