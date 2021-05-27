package com.training.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Arun");
		set.add("Sumitha");
		set.add("Vignesh");
		set.add("Arun");
		set.add("Vignesh");
		System.out.println(set);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Arun");
		linkedHashSet.add("Sumitha");
		linkedHashSet.add("Kalaimagal");
		linkedHashSet.add("Arun");
		linkedHashSet.add("Vignesh");
		System.out.println(linkedHashSet);

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Arun");
		treeSet.add("Sumitha");
		treeSet.add("Reena");
		treeSet.add("Arun");
		treeSet.add("Vignesh");
		System.out.println(treeSet);

	}

}
