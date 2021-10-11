package com.ust.main;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

private SortField sortField;

public StudentComparator(SortField sortField) {
	this.sortField = sortField;
}

@Override
public int compare(Student s1, Student s2) {
	int val = 0;
	switch (sortField) {
	case Name:
		val = s1.getName().compareTo(s2.getName());
		break;
	case Marks:
		val = (int) (s1.gettotalmarks()-s2.gettotalmarks());
		break;

	default:
		val = s1.getId()-s2.getId();
		break;
	}
	return val;
}



}
