public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
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
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var generalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общая масса двух бойцов " + generalWeight + " кг");
        var differenceWeight = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в массе между бойцами " + differenceWeight + " кг");

        var differenceWeight1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в массе между бойцами " + differenceWeight1 + " кг");
        var differenceWeight2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в массе между бойцами " + differenceWeight2 + " кг");

        var workHours = 640;
        var workPeopleHour = 8;
        var worker = workHours / workPeopleHour;
        System.out.println("Всего работников в компании - " + worker + " человек");

        worker = worker + 94;
        var newWorkHours = worker * workPeopleHour;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + newWorkHours + " часов работы может быть поделено между сотрудниками");




    }
}