package Practice_8주차;

import java.util.Scanner;
public class ParallelOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("10개의 정수를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        Thread additionThread = new Thread(() -> {
            int addResult = 0;
            System.out.println("current add result: " + addResult);
            try {
                for (int number : numbers) {
                    Thread.sleep(700);
                    addResult += number;
                    System.out.println("current add result: " + addResult);
                    if (Math.abs(addResult) > 1000) {
                        throw new LargeBoundException("The addition result is too large");
                    }
                }
            } catch (InterruptedException | LargeBoundException e) {
                System.err.println(e.getMessage());
            }
        });

        Thread multiplicationThread = new Thread(() -> {
            int mulResult = 1;
            System.out.println("current mul result: " + mulResult);
            try {
                for (int number : numbers) {
                    Thread.sleep(500);
                    mulResult *= number;
                    System.out.println("current mul result: " + mulResult);
                    if (Math.abs(mulResult) > 100000) {
                        throw new LargeBoundException("The multiplication result is too large");
                    }
                }
            } catch (InterruptedException | LargeBoundException e) {
                System.err.println(e.getMessage());
            }
        });

        /* 마지막 쓰레드 */
        Thread addtionalThread = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("additional thread");
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                System.out.println("additional Thread Interrupted");
            }
        }, "additional-thread");

        additionThread.start();
        multiplicationThread.start();
        addtionalThread.start();

        try {
            additionThread.join();
            multiplicationThread.join();

            Thread.sleep(3000);
            addtionalThread.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main Thread ended");
    }
}
