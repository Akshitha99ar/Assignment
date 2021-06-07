package com.assignDay2.prg4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<CD> cd=new TreeSet<CD>();
		
		cd.add(new CD("hh","aaa"));
		cd.add(new CD("ah","fff"));
		cd.add(new CD("ih","kk"));
		cd.add(new CD("kkh","lll"));
		cd.add(new CD("jh","gg"));
		
		
		for(CD element: cd) {
			System.out.println(element);
		}

	}

}
