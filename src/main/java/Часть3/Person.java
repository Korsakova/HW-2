package Часть3;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;

public class Person implements Comparable<Person> {
    int age;
    String sex;
    String name;

    // Конструктор для массива Person
    public Person(int age, String sex, String name){
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public Person(){
        // Генерация возраста от 0 до 100
        this.age = (int) (Math.random()*101);
        // Генерация пола от 0 до 1, где 0-man, 1- woman
        this.sex = ((int) (Math.random()*2)) == 0? "man": "woman";
        // Генерация имени
        Random random = new Random();
        int nums = 5 + random.nextInt(5);
        StringBuilder newName = new StringBuilder();
        for (int t = 0; t < nums; t++) {
            newName.append((char) (97 + random.nextInt(26)));
        }
        this.name = newName.toString();

    }

    public int compareTo(Person p2) {

        // сравнение пола
        if(!this.sex.equals(p2.sex)){
          return this.sex.equals("man")? 1: -1;
        }
        // сравнение возраста
        if(this.age != p2.age){
            return this.age > p2.age? 1: -1;
        }

        int v = -this.name.compareTo(p2.name);

        if(v == 0){
            throw new RuntimeException("Кажется Вы близнецы!");
        }
        // сравнение имен и возврат итогового сравнения
        return v;
    }

    public static void main(String[] args)   {
        final Scanner sc= new Scanner(System.in);
        System.out.print("Введите число от 1 до 1000 и более:");
        int n = sc.nextInt();
        // создание нового массива
        Person[] newPersons = new Person[n];
        for(int i = 0; i < n; i++){
            // создание нового элемента массива
            newPersons[i] = new Person();
        }

        // Вывод на экран до сортировки
        System.out.println(Arrays.toString(newPersons));

        // Сортировка классом BubbleSortingClass
        BubbleSortingClass newFirstSortingClass = new BubbleSortingClass();
        newFirstSortingClass.sort(newPersons);

        // Сортировка классом InsertionSortingClass
        InsertionSortingClass newInsertionSortingClass = new InsertionSortingClass();
        newInsertionSortingClass.sort(newPersons);

        // Вывод на экран после сортировки по методу прописанному в классе FirstSortingClass
        System.out.println(Arrays.toString(newPersons));
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}