package week12;

public class 사칙연산Test {

	public static void main(String[] args) {
		//
		사칙연산 정수 = new 사칙연산( 3,4 );
		사칙연산 실수 = new 사칙연산(6 , 7);

	}

}
class 사칙연산{
	int num1;
	int num2;
	public 사칙연산(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
    public int add(int num1, int num2){
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public double div(int num1, int num2) {
		return num1/num2;
	}
	
	
	@Override //Object가 있는 메소드 내입맛에 맞게 바꾸는것
	public String toString() {
		return "사칙연산 [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}

