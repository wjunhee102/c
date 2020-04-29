package org.open.middleTest_suzi.eclipse;

public class exam {

	public static void main(String[] args) {
		Student st1 = new Student(22, 32, 12, 10, "Kim");
		Student st2 = new Student(25, 35, 19, 10, "Choi");
		Student st3 = new Student(28, 36, 17, 10, "Park");
		Student st4 = new Student(21, 33, 20, 9, "Lee");
		Student st5 = new Student(27, 37, 15, 10, "Han");
		
		int sum[] = { st1.sum, st2.sum, st3.sum, st4.sum, st5.sum};
		String hakjum[] = { st1.hakjum, st2.hakjum, st3.hakjum, st4.hakjum, st5.hakjum};
		
		double tot = 0;
		
		for(int i = 0; i < sum.length; i++) {
			tot += sum[i];
		}
		
		double avg = tot/sum.length;
		
		st1.result();
		st2.result();
		st3.result();
		st4.result();
		st5.result();

		System.out.println("전체 평균은 "+avg+" 점입니다.");
	}
}
