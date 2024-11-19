package com.cba.naturalordering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
//{
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}

public class App {

    public static void main(String[] args) {
/*

		List<String> list = new ArrayList<>();
		SortedSet<String> set = new TreeSet<>();

		addElements(list);
		addElements(set);


		showElements(list);
		System.out.println();
		showElements(set);
*/

        List<Person> list = new ArrayList<>();
        SortedSet<Person> set = new TreeSet<>();

        addElements(list);
        addElements(set);


        showElements(list);
        System.out.println();
        showElements(set);
    }

	/*private static void showElements(Collection<String> col) {

		for(String element: col) {
			System.out.println(element);
		}

	}

	private static void addElements(Collection<String> col) {

		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
	}
*/
    private static void showElements(Collection<Person> col) {

        for(Person element: col) {
            System.out.println(element);
        }

    }

    private static void addElements(Collection<Person> col) {

        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mike"));
    }
}