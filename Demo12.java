package com.tka;

public class Demo12 {
	public static void main(String[] args) {
		for(int i = 5;i>=1;i--) {
			for(char j = 'a';j<'a'+i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
