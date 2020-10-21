package Часть3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

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
//        Random random = new Random();
//        int nums = random.nextInt(5,10);
//        StringBuilder this.name = new String();
//        for(int k = 0; k < nums; k++){
//            this.name.append((char) random.nextInt(97, 123));
//        }


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
        Person[] newPersons = new Person[4];


        newPersons[0] = new Person(10, "man","Ян");
        newPersons[1] = new Person(45, "woman","Василиса");
        newPersons[2] = new Person(15, "man","Олег");
        newPersons[3] = new Person(45, "woman","Ольга");

        // Вывод на экран до сортировки
        System.out.println(Arrays.toString(newPersons));

        FirstSortingClass newFirstSortingClass = new FirstSortingClass();
        newFirstSortingClass.sorting(newPersons);

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