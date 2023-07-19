public class Main {
    public static void main(String[] args) {
        int age = 18; // Задача 1
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершннолетний");
        } else
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершннолетия, нужно немного подождать");


        int weather = 9; // Задача 2
        if (weather <= 5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        } else System.out.println("На улице " + weather + " градусов, можно идти без шапки");


        int driveLimit = 50; //Задача 3
        if (driveLimit > 60) {
            System.out.println ("Если скорость " + driveLimit + " , придется заплатить штраф");
        }
        else System.out.println ("Если скорость меньше, либо равна " + driveLimit+ ", можно ездить спокойно");


        int age1 =1; // Задача 4
        if (age1 <2) {
            System.out.println ("Если возраст человека равен " + age1 + ", то ему пора спать" );
        }
        int age2 = 5;
        boolean canGoToPlaySchool = age2 >= 2 || age2 <=6;
        if (canGoToPlaySchool) {
            System.out.println ("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        int age3 = 7;
        boolean canGoToSchool = age3 >=7 || age3 <18;
        if (canGoToSchool) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
         int age4 = 20;
         if (age4>=18 && age4<=24) {
             System.out.println ("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
         }
         int age5 = 25;
         if (age5 >24) {
             System.out.println ("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
         }
             int age6 = 65;
             if (age6 >60) {
                 System.out.println ("Если возраст человека равен " + age6 + ", то ему можно отдпхнуть");
             }


         int child =4; // Задача 5
             if (child <5) {
                 System.out.println ("Если возраст ребенка равен" + child+ ", то он не может кататься на аттракционе");
             }
        int child1 = 10;
             boolean canPlayWithAdult = child1 >=5 || child1 <=14;
             if (canPlayWithAdult) {
                 System.out.println("Если возраст ребенка равен " + child1+ ", то он может кататься на аттракционе в присутствии взрослого");
             }
             int child2 = 18;
             if (child2 >14) {
             System.out.println ("Если возраст ребенка равен " + child2+ ", то он может кататься на аттракционе без взрослых");
             }

             int capacityCarriage =102; // Задача 6
             int capacitySeatPlace =60;
             int capacityStayPlace = capacityCarriage-capacitySeatPlace;
             int place = 80;
             int leftSeatPlace = capacitySeatPlace-place;
             if (leftSeatPlace >=1 && leftSeatPlace <60) {
                 System.out.println("В вагоне осталось " + leftSeatPlace + " сидячих мест"); // немного разнообразил и решил через показ остатка кол-ва мест
             }
             else System.out.println ("В вагоне не осталось сидячих мест");
                 int place1= 30;
                 int leftStayPlace = capacityStayPlace-place1;
                 if (leftStayPlace >=1 && leftStayPlace <=42) {
                     System.out.println("В вагоне осталось " + leftStayPlace + " стоячих мест"); // аналогично предыдущему
                 }
                 else System.out.println ("В вагоне не осталось стоячих мест");
             int place2 = 120;
             if (place2 >102) {
                 System.out.println ("Вагон уже полностью забит");
             }
             int one =1; // Задача 7
             int two =2;
             int three =3;
             if (one >=3) {
                 System.out.println ("Самое большое число");
             }
             else System.out.println (" Число " +one+ " не является самым большим");
        if (two >=3) {
            System.out.println ("Самое большое число");
        }
        else System.out.println (" Число " +two+ " не является самым большим");
        if (three >=3) {
            System.out.println ("Самое большое число");
        }
        else System.out.println (" Число " +three+ " не является самым большим");







    }
    }
