package Practice_6주차;

public class CalcElement {
        public static interface Operator {
            int operate(int value);
        }

        private Operator operator;

        public void setOperator(Operator operator) {
            this.operator = operator;
        }

        public int calculate(int value) {
            return operator.operate(value);
        }

    }