package com.classwork.basics;

import java.util.PriorityQueue;
import java.util.*;
import java.util.LinkedList;


public class Queue {

	public static void main(String[] args) {
		try {
		
		PriorityQueue queue=new PriorityQueue();
		queue.add(20);
		queue.add(50);
		queue.add(45);
		queue.add(65);
		System.out.println("Before Remove:"+queue);
		
		System.out.println(queue.remove());
		System.out.println("After Remove:"+queue);
		
		}catch(Exception e) {
			System.out.println("Exception is:"+e);
			
		}
		

	}

}
