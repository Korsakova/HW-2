package Часть3;

public class BubbleSortingClass implements Sorter<Person>{

    public Person[] sort(Person[] persons) {

        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                Person personP1 = persons[i];
                Person personP2 = persons[j];

                int v = personP1.compareTo(personP2);

                if (v < 0){
                    persons[i] = personP2;
                    persons[j] = personP1;
                }

            }
        }
        return persons;
    }
}