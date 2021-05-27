package com.training.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Arun", "Anthoni");
		map.put("Sumitha", "Velmani");
		map.put("Vignesh", "R");
		map.put("Reena", "Vijayakumar");
		map.put("Mariappan", "G");
		System.out.println(map);

		for (Map.Entry<String, String> t : map.entrySet()) {
			// System.out.println(t.getKey());
			// System.out.println(t.getValue());
			if (t.getKey().length() == 7) {
				System.out.println(t.getKey() + "->Found");
			}
		}

		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Arun", "Anthoni");
		linkedHashMap.put("Sumitha", "Velmani");
		linkedHashMap.put("Vignesh", "R");
		linkedHashMap.put("Reena", "Vijayakumar");
		linkedHashMap.put("Mariappan", "G");
		System.out.println(linkedHashMap);

		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Arun", "Anthoni");
		treeMap.put("Sumitha", "Velmani");
		treeMap.put("Vignesh", "R");
		treeMap.put("Reena", "Vijayakumar");
		treeMap.put("Mariappan", "G");
		System.out.println(treeMap);
	}

}
