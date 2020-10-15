package Часть3;

public class Person implements Comparable<Person> {
    int age;
    String sex;
    String name;

    public int compareTo(Person p2) {
        // Если this.sex == p2 == man, переходим ко второму условию
        // Если this.sex != p2,  но this.sex== man, пишем сперва this.sex
        // Если this.sex != p2,  но p2== man, пишем сперва p2
        if(this.sex.equals(p2)){

        }
        // Если this.age == p2, переходим ко третьему условию
        // Если this.age > p2, пишем сперва this.age
        // Если this.age > p2, пишем сперва p2
        else if(p2.age){

        }
        else if(p2.name){

        }

        return 0;
    }
}