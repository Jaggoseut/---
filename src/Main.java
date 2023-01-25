public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        // Переменная b = 0 поэтому код не компилируется, для решения данной проблемы была добавлена проверка в devide.
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}
