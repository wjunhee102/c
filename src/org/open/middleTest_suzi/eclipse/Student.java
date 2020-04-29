package org.open.middleTest_suzi.eclipse;

public class Student {
	public int jumsu[] = {0, 0, 0, 0};
	public String n;
	public int sum = 0;
	public String hakjum;
	
	Student(int midd, int fn, int pro, int ab,  String n) {
		this.jumsu[0] = midd;
		this.jumsu[1] = fn;
		this.jumsu[2] = pro;
		this.jumsu[3] = ab;
		this.n = n;
		this.sum = this.getSum();
		this.hakjum = this.getRank();
	}
	
	public int getSum() {
		int score[] = this.jumsu;
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		return sum;
	}
	
	public String getRank() {
		
		int score = this.getSum();
		String res;
		
		if(score <= 100 && score >= 95) {
            res = "A+";
        } else if(score <= 94 && score >= 90) {
            res = "A";
        } else if(score <= 89 && score >= 85) {
            res = "B+";
        } else if(score <= 84 && score >= 80) {
            res = "B";
        } else if(score <= 79 && score >= 75) {
            res = "C+";
        } else if(score <= 74 && score >= 70) {
            res = "C";
        } else if(score <= 69 && score >= 65) {
            res = "D+";
        } else if(score <= 64 && score >= 60) {
            res = "D";
        } else if(score <= 59) {
            res = "F";
        } else {
            res = "error";
        }
		
		return res;
	}
	
	public int result() {
		String n = this.n;
		int jumsu[] = this.jumsu;
		int sum = this.getSum();
		String hakjum = this.getRank();
		
		System.out.println(n+"의 중간고사는 "+jumsu[0]+"점, 기말고사는 "+jumsu[1]+"점, 과제 점수는 "+jumsu[2]+"점, 출석은 "+jumsu[3]+"점 입니다.");
		System.out.println("전체 총점은 "+sum+"점이고, 학점은 "+hakjum+" 입니다.");
		return 0;
	}
}

