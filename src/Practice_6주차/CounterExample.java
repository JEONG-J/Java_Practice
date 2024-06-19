package Practice_6주차;

public class CounterExample {
    public static void main(String[] args) {
        Counter counter = new Counter(
                new String[] {"sub", "sub", "add"},
                new int[] {2, 1, 3});
        counter.showCount();

        counter.clickButton(2);
        counter.showCount();

        counter.clickButton(0);
        counter.showCount();

        counter.clickButton(1);
        counter.showCount();
    }
}
