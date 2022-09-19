package com.ashumam;

import java.util.Arrays;

public class OccurranceOfElement {
	public static void main(String[] args) {
		
	int a[]= {101,201,201,30,10,10,10};
	Arrays.sort(a);
	
	
	for(int i=0;i<a.length;i++) {
		int count=1;
		
		for(int j=i+1; j<a.length;j++) {
			if(a[i]==a[j]) 	
				count++;
		}
		
		System.out.println(a[i]+"\t"+count);
		i=i+(count-1);
	}
	
	}
}
