package Practice_6주차;

public class Counter {
    CalcElement[] calcarr = new CalcElement[3];
    private int count = 0;

    Counter(String[] optypes, int[] steps) {
        for(int i = 0; i < calcarr.length; i++) {
            calcarr[i] = new CalcElement();
            final int step = steps[i];
            switch (optypes[i]) {
                case "add":
                    calcarr[i].setOperator(new CalcElement.Operator() {
                        @Override
                        public int operate(int value) {
                            return value + step;
                        }
                    });
                    break;
                case "sub":
                    calcarr[i].setOperator(new CalcElement.Operator() {
                        @Override
                        public int operate(int value) {
                            return value - step;
                        }
                    });
                    break;
                case "mul":
                    calcarr[i].setOperator(new CalcElement.Operator() {
                        @Override
                        public int operate(int value) {
                            return value * step;
                        }
                    });
                    break;
            }
        }
    }

    void showCount() {
        System.out.println("The number is " + count + " now.");
    }

    void clickButton(int value) {
        count = calcarr[value].calculate(count);
    }
}
