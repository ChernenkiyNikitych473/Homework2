public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача №1");
        var dog = 11.0;
        System.out.println(dog);
        var cat = 6.9;
        System.out.println(cat);
        var paper = 763800;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача №2");
        var dog = 11.0;
        dog = dog + 7;
        System.out.println(dog);
        var cat = 6.9;
        cat = cat + 7;
        System.out.println(cat);
        var paper = 763800;
        paper = paper + 7;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача №3");
        var dog = 11.0;
        dog = dog + 7;
        dog = dog - 6.5;
        System.out.println(dog);
        var cat = 6.9;
        cat = cat + 7;
        cat = cat - 5.6;
        System.out.println(cat);
        var paper = 763800;
        paper = paper + 7;
        paper = paper - 7680;
        System.out.println(paper);

    }
    public static void task4() {
        System.out.println("Задача №4");
        var friend = 22;
        System.out.println(friend);
        friend = friend + 5;
        System.out.println(friend);
        friend = friend / 10;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача №5");
        var frog = 6.5;
        System.out.println(frog);
        frog = frog * 13;
        System.out.println(frog);
        frog = frog / 6.5;
        System.out.println(frog);
        frog = frog + 7;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача №6");
        var boxerWeight1 = 81.2;
        var boxerWeight2 = 85.7;
        var totalPounds = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + totalPounds + " кг");
    }
    public static void task7() {
        System.out.println("Задача №7");
        var boxerWeight1 = 81.2;
        var boxerWeight2 = 85.7;
        var poundsDifferential1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе бойцов 1 " + poundsDifferential1 + " кг");
        var totalPounds = boxerWeight1 + boxerWeight2;
        var poundsDifferential2 = (boxerWeight2 - boxerWeight1) % totalPounds;
        System.out.println("Разница в весе бойцов 2 " + poundsDifferential2 + " кг!");
    }
    public static void task8() {
        System.out.println("Задача №8");
        var totalisHours = 643;
        var perHoursEmployee = 11;
        var totalEmployees = totalisHours / perHoursEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 97;
        var employeeHours = totalisHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + employeeHours + " часа работы может быть поделено между сотрудниками.");
    }
}