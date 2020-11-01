package Часть3;

public class InsertionSortingClass implements Sorter<Person> {

    public Person[] sort(Person[] persons) {
        for (int i = 1; i < persons.length; i++) {
            Person personP1 = persons[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                Person personP2 = persons[j];
                int a = personP1.compareTo(personP2);
                if (a > 0){
                    persons[j + 1] = persons[j];
                }
                else{
                    break;
                }
            }
            persons[j +1] = personP1;
        }
        return persons;
    }
}