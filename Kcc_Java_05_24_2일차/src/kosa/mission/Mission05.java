package kosa.mission;

import java.util.ArrayList;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴를 명령문을 실행해보자.
		// 1. 추가 2. 출력 3. 검색 4. 종료
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> choices = new ArrayList<>();
//		while (true) {
//			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
//			System.out.print("메뉴 :");
//			String menu = sc.nextLine();
//			
//			switch (menu) {
//			case "1":
//				System.out.println("추가 선택");
//				String choice = sc.nextLine();
//				choices.add(choice);
//				break;
//			case "2":
//				System.out.println("출력 선택");
//				for(String n : choices) {
//					System.out.print(n + ",");
//				}
//				break;
//			case "3":
//				System.out.println("검색 선택");
//				System.out.println("1. 제육덮밥 2. 돈까스 3. 비빔밥");
//				System.out.println();
//				break;
//			case "4":
//				System.out.println("프로그램 종료 선택");
//				return;
//			}
//		}

		
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
		System.out.print("메뉴 선택 : ");
		String menu = sc.nextLine();
		    switch(menu) {
		        case "1":
		        System.out.println("추가 선택");
		        break;
		        case "2": 
		        System.out.println("출력 선택"); 
		        break;
		        case "3": 
		        System.out.println("검색 선택"); 
		        break;
		        case "4": 
		        System.out.println("종료 선택"); 
		        return;
		    }
		}
	}

}
