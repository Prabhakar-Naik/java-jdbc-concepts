package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListStudents1 {

	public static void main(String[] args) throws Exception{
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(100,"prabha","TS","java",25000,"Dev"));
		list.add(new Student(105,"sudha","KK","pytho",22000,"Dev"));
		list.add(new Student(121,"srinu","MP","javaScript",30000,"Test"));
		list.add(new Student(140,"shiva","AP","java",45000,"Design"));
		list.add(new Student(102,"kamala","KK","ReactJs",36000,"cloud"));
		list.add(new Student(120,"jenni","AP","Angular",25000,"HR"));
		
		Map<Integer,Student> map=new HashMap<>();
		
		map.put(1,new Student(100,"prabha","TS","java",25000,"Dev"));
		map.put(3,new Student(105,"sudha","KK","pytho",22000,"Dev"));
		map.put(5,new Student(121,"srinu","MP","javaScript",30000,"Test"));
		map.put(7,new Student(140,"shiva","AP","java",45000,"Design"));
		map.put(2,new Student(102,"kamala","KK","ReactJs",36000,"cloud"));
		map.put(8,new Student(120,"jenni","AP","Angular",25000,"HR"));
		
		
		System.out.println(list);
		System.out.println(map);
		
		System.out.println("Filtering the condition in normal way: ");
		for(Student s:list) {
			
			if(s.getDpmt().equals("Dev") && s.getFee()>=20000)
			{
				System.out.println(s.getSname());
			}
		}
		
		System.out.println("Filtering the condition using streams: ");
		list.stream().filter(s ->s.getDpmt().equals("Dev") && s.getFee()>=20000).forEach(n->System.out.println(n.getSname()));
		
		
		System.out.println("In map Interface: ");
		for(Entry<Integer,Student> s:map.entrySet()) 
		{
			if(s.getValue().getDpmt().equals("Dev") && s.getValue().getFee()>=20000)
				System.out.println(s.getValue().getSname());
		}
		System.out.println("Using Stream Map:");
		map.forEach((k,v)->System.out.println((v.getDpmt().equals("Dev") && v.getFee()>=20000)));
		
		
	}
}
