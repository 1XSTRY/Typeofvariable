public class Main {
    public static void main(String[] args) {
        //task 1
        //Integer type
        byte a = 45;
       short b = 20000;
       int c = 100000;
       long d = 30000000;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        //Floating Point Types
        float pi = 3.14f;
        double e = 4.54064369;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        System.out.println("Значение переменной e с типом double равно " + e);
        //task 2
        float alfa = 27.12f;
        long bravo = 987678965549L;
        float charlie = 2.786f;
        short delta = -159;
        short echo = 27897;
        byte foxfort = 67;
        System.out.println( alfa + "\n" + bravo + "\n" + charlie + "\n" + delta + "\n" + echo + "\n" + foxfort);
        //task 3
        byte ludmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        byte totalStudents = (byte) (ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents);
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + (paper / totalStudents) + " листов бумаги");
        //task 4
        byte oneMin = 1;
        byte oneHour = (byte) (oneMin * 60);
        short oneDay = (short) (oneHour * 24);
        byte bottlesPerMin = 16 / 2;
        System.out.println("За 20 мин машина произвела " + (bottlesPerMin * 20) + " штук бутылок");
        System.out.println("За час машина произвела " +  (bottlesPerMin * oneHour) +  " штук бутылок");
        System.out.println("За день машина произвела " +  (bottlesPerMin * oneDay) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (bottlesPerMin * oneDay * 3) + " штук бутылок");
        System.out.println("За 3 мес машина произвела " + (bottlesPerMin * oneDay * 30) + " штук бутылок");
        //task 5
        byte allPaint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        byte oneClassPaint = 6;
        byte classInSchool = (byte) (allPaint / oneClassPaint);
        System.out.println("В школе, где " + classInSchool + " классов, нужно " + (whitePaintClass * classInSchool) + " банок белой краски и " + (brownPaintClass * classInSchool) + " банок коричневой краски");
        //task 6
        byte bananas = 5;
        byte oneBananaWeight = 80;
        short bananasWeight = (short) (oneBananaWeight * bananas);
        short milk = 2;
        byte oneMlMilkWeight = 105;
        short milkWeight = (short) (oneMlMilkWeight * milk);
        byte iceCream = 2;
        byte oneIceCreamWeight = 100;
        short iceCreamWeight = (short) (oneIceCreamWeight * iceCream);
        byte eggs = 4;
        byte oneEggWeight = 70;
        short eggsWeight = (short) (oneEggWeight * eggs);
        short breakfastG = (short) (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);
        double breakfastKg = (double) breakfastG / 1000;
        System.out.println(breakfastG);
        System.out.println(breakfastKg);


















    }
}