package com.ust.main;

import java.util.ArrayList;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
				List<Student> studList = new ArrayList<>();
				studList.add(new Student( 101,"Anu",850));
				studList.add(new Student( 102,"Manu", 907));
				studList.add(new Student( 105,"Rinu", 956));
				studList.add(new Student( 100,"Jinu", 750));
				studList.add(new Student( 108,"Cinu", 400));
				
				System.out.println( "\nlist of students : " +studList);
				
				//sorting students based on id
				System.out.println("\nSorted by ID");
				studList.sort((s1, s2) -> s1.getId() - s2.getId());
				System.out.println(studList);
				
				//sorting students based on name
				System.out.println("\nSorted by Name");
		        studList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
				System.out.println(studList);
				
				//sorting based on marks
				System.out.println("\nSorted by Marks");
			    studList.sort((s1, s2) -> (int) (s1.gettotalmarks() - s2.gettotalmarks()));
				System.out.println(studList);

			
         //getting student status based on marks
		   System.out.println("\nStatus of students based on marks");
		   for(Student s:studList) {
			if (s.totalmarks>=900)
				System.out.println(s.name+" " +"Excellent");
			else if(s.totalmarks>=750&s.totalmarks<=900){
				System.out.println( s.name+ " " +"very good");
			}
			else if (s.totalmarks>=500&s.totalmarks<=750) {
					System.out.println(s.name+" "+"good");
					
			}
			else {
					System.out.println(s.name+ " " + "needs improvemment");
				}
		    }
		
	
	}
}

 
       

	
		
	
	
		


