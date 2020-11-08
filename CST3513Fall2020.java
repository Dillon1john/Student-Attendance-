package objectPractice;
import java.util.Scanner;

//import java.lang.ClassNotFoundException;
public class CST3513Fall2020 {
    public static void main(String [] args ) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("Enter radius of circle");
        Circle cir = new Circle();
        cir.setR(5);
        cir.setR(in.nextDouble());
        int x, y;
        //x =  cir.getX();
        //y = cir.getY();
        System.out.println("the area of the circle "+cir.area() );
        System.out.println("Circle is centered at "+ cir.getX()+","+cir.getY());

   */
        Time class_start = new Time(14, 0, 0) ;
            Time check_in = new Time();
            Time temp= new Time();
            int count_late = 0;
            int count_late30 = 0;
            for (int i=0; i<24;i++) {
                class_start.setHour(14);
                class_start.setMinute(0);
                class_start.setSecond(0);
                temp.setHour(0);
                temp.setMinute(0);
                temp.setSecond(0);
                System.out.println("Enter arrive time -hour, mins, and seconds ");
                int h, m, s;
                h = in.nextInt();
                m = in.nextInt();
                s = in.nextInt();
                check_in.setHour(h);
                check_in.setMinute(m);
                check_in.setSecond(s);
                check_in.Display();
                check_in.DisplayAM();
                if (check_in.Greater(class_start)) {
                    count_late++;

                    System.out.print("You are late for class");
                    while (check_in.Greater(class_start)) {
                        class_start.increment();
                        temp.increment();
                    }
                    temp.Display();
                    if (temp.getHour() * 60 + temp.getMinute() >= 30)
                        count_late30++;
                    }
                 else if (check_in.EqualTo(class_start))

                    System.out.print("You are on time");
                else
                    System.out.println("You are early");
            }
            System.out.println(count_late+" many were late for class");
            System.out.println(count_late30+" many were late by more than 30 minutes");








    }


        //Employee emp = new Employee();

    }


