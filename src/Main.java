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

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 3;
        System.out.println("Значение переменной a с типом byte равно "+ a);
        short b = 4;
        System.out.println("Значение переменной b с типом short равно "+ b);
        int c = 5;
        System.out.println("Значение переменной c с типом int равно "+ c);
        long d = 1000000;
        System.out.println("Значение переменной d с типом long равно "+ d);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
       byte ludmila= 23;
       byte anna= 27;
       byte ekaterina= 20;
       int paper = 480;
       int list= paper/(ludmila+anna+ekaterina);
       System.out.println("На каждого ученика рассчитано "+ list+ " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte butlki= 16;
        byte timeMin= 2;
        byte proizvoditelnostMin= (byte)(butlki/timeMin);
        int Min20= proizvoditelnostMin*20;
        System.out.println("За 20 минут машина произвела " +Min20+ " штук бутылок.");
        int day=24*60*proizvoditelnostMin;
        System.out.println("За 20 минут машина произвела " +day+ " штук бутылок.");
        int day3=3*day;
        System.out.println("За 20 минут машина произвела " +day3+ " штук бутылок.");
        int month=10*day3;
        System.out.println("За 20 минут машина произвела " +month+ " штук бутылок.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte school= 120;
        byte whiteClass= 2;
        byte brownClass=4;
        int class1= school/(whiteClass+brownClass);
        int white=class1*2;
        int brown= class1*4;
        System.out.println("В школе, где "+class1+ " классов, нужно "+white+ " банок белой краски и "+brown+ " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int banan= 80*5;
        int milk = 105*2;
        int plombir= 100*2;
        int egg= 70*4;
        int weightG=banan+milk+plombir+egg;
        float weightKg=weightG/(float)1000;
        System.out.println(weightG);
        System.out.println(weightKg);
    }
    public static void task7 () {
        System.out.println("Задача 7");
     int sbros=7000;
     int a = 250, b = 500, c= 275;
     int a1=sbros/a, b1=sbros/b, c1= sbros/c;
     System.out.println(a1 +" "+ b1 +" "+ c1);
    }
    public static void task8 (){
        System.out.println("Задача 8");
     int masha=67760*12;
     int denis= 83690*12;
     int kristina= 76230*12;
     double zp10Masha=masha*1.1;
     double zp10Denis=denis*1.1;
     double zp10Kristina=kristina*1.1;
     double a1=zp10Masha-masha;
     double a2=zp10Denis-denis;
     double a3=zp10Kristina-kristina;
     System.out.println("Маша теперь получает " +zp10Masha+ " рублей. Годовой доход вырос на " +a1+ " рублей");
     System.out.println("Денис теперь получает " + zp10Denis+ " рублей. Годовой доход вырос на "+a2+" рублей");
     System.out.println("Кристина теперь получает "+zp10Kristina+" рублей. Годовой доход вырос на "+a3+" рублей");
    }

}