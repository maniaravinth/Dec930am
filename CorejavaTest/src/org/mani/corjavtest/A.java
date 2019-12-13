package org.mani.corjavtest;

import org.mani.additonaltest.B;


	public class A extends B {
		  public A() {
			 System.out.println("Default const...");
		  }

		  public static void main(String[] args) {
		    A a = new A();
		  }

		}