public class Main {//Задание 1-3
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat +4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);


        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var overallWeight = firstBoxerWeight +secondBoxerWeight;
        System.out.println("Общий вес двух бойцов = " + overallWeight + "кг");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight; //также возможно остатком от деления
        var differenceWeight1 = secondBoxerWeight % firstBoxerWeight;

        System.out.println("Разница в весе бойцов = " + differenceWeight +"кг");
        System.out.println("Разница в весе бойцов = " + differenceWeight1 +"кг");

        var workingTime = 8;
        var generalWorkingTime = 640;
        var numberWorkers = generalWorkingTime / workingTime;
        System.out.println("Всего работников в компании "+ numberWorkers + " человек");
        numberWorkers = numberWorkers + 94;
        generalWorkingTime = workingTime * numberWorkers;
        System.out.println("Если в компании работает " + numberWorkers +" человек, то всего " + generalWorkingTime + " часов работы может быть поделено между сотрудниками");



    }
}
