package test_day2;

import java.util.Scanner;

public class testdarr {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in); //이름 입력
		Scanner s2=new Scanner(System.in); //정수 입력
		
		System.out.println("====== 동적 배열을 사용한 성적 프로그램 =====\n");
		
		System.out.print("학생 수 : ");
		int stuNum=s2.nextInt();
		
		String stuName[]=new String[stuNum];
		
		int score[][]=new int[stuNum][];
		
		int sums[]=new int[stuNum];
		
		for(int i=0; i<score.length; i++) { //입력
			System.out.print("학생 이름 입력 : ");
			stuName[i]=s1.nextLine();
			System.out.print("과목수 입력 : ");
			int subNum=s2.nextInt();
			score[i]=new int[subNum];
			for(int j=0; j<score[i].length; j++) {
				System.out.print("점수 입력 : ");
				score[i][j]=s2.nextInt();
				sums[i]+=score[i][j];
			}
		}

		for(int i=0; i<stuName.length; i++) { //출력
			System.out.print(stuName[i]+" ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.print("합계 : "+sums[i]);
			System.out.println();
		}
		
		s1.close();
		s2.close();

	}

}
