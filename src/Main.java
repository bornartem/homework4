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
        } else {
            System.out.println("Если скорость меньше, либо равна " + driveLimit + ", можно ездить спокойно");
        }


        int age1 =25; // Задача 4
        if (age1 <2) {
            System.out.println ("Если возраст человека равен " + age1 + ", то ему пора спать" );
        } else if (age1 >= 2 && age1 <=6) {
            System.out.println ("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >=7 && age1 <18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1>=18 && age1<=24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else if (age1 >24) {
            System.out.println ("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        } else if (age1 >60) {
            System.out.println ("Если возраст человека равен " + age1 + ", то ему можно отдпхнуть");
        }


         int child =15; // Задача 5
             if (child <5) {
                 System.out.println ("Если возраст ребенка равен" + child+ ", то он не может кататься на аттракционе");
             } else if (child >=5 && child <=14) {System.out.println("Если возраст ребенка равен " + child+ ", то он может кататься на аттракционе в присутствии взрослого");
             } else  {System.out.println ("Если возраст ребенка равен " + child+ ", то он может кататься на аттракционе без взрослых");
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
             if (one >= two && one >= three) {
                 System.out.println ("Самое большое число " + one);
             } else if (two >= three) {
                 System.out.println (" Число " +two+ " является самым большим");
             } else {
                 System.out.println("Самое большое число " + three);
             }







    }
    }
