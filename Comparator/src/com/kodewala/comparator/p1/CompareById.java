package com.kodewala.comparator.p1;

import java.util.Comparator;

public class CompareById implements Comparator<Student>{

	@Override
	public int compare(Student s, Student v) {
		int result = Integer.compare(s.getId(), v.getId());
		return result;
	}

}
