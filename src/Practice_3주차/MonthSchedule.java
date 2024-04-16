package Practice_3주차;

import java.util.Scanner;

public class MonthSchedule {
    int totalDate;
    Day[] dayarr;
    Scanner scanner;

    MonthSchedule(int totalDate) {
        this.totalDate = totalDate;
        this.dayarr = new Day[totalDate];
        for(int i = 0; i < totalDate; i++) {
            dayarr[i] = new Day();
        }
        scanner = new Scanner(System.in);
    }

    void input() {
        System.out.print("Date(1-30)? ");
        int date = scanner.nextInt();
        System.out.print("Do list(without space)? ");
        String work = scanner.next();
        dayarr[date - 1].set(work);

    }

    void view() {
        System.out.print("Date(1-30)? ");
        int date = scanner.nextInt();
        dayarr[date - 1].show();
        System.out.println();
    }

    void finish() {
        System.out.println("This is the end of the program");
        scanner.close();
    }

    void run() {
        System.out.println("This is a schedule management program for this month.");
        int command;
        while(true) {
            System.out.print("Command(Insert: 1, Show: 2, Quit: 3 >> ");
            command = scanner.nextInt();
            switch(command) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}

