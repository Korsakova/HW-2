package Часть2;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Зададим число N
        double N = 10;
        // Вычислим квадратный корень n раз
        for (int s = 0; s < N; s++) {
            // Генерируем случайное число от -10 до 10
            double k = Math.random()*21-10;
            // Вывести в консоль суть
            System.out.println("Мы сгенерировали число " + k);
            // Условие отрицания
            if(k<0){
                throw new IllegalArgumentException();
            }
            // Вычисляем квадратный корень
            double q = Math.sqrt(k);
            // Сравниваем квадрат целого числа q и числа k
            if((int) (q*q) == k){
                // Вывод полученного числа на  экран
                System.out.println(q);
            }
        }

    }

}
