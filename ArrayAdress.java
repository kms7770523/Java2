package day8_array;

public class ArrayAdress {

	public static void main(String[] args) {
		int[] arr=new int[3];//선언하면 정수 0 값이 초기화됨
		System.out.println("arr배열이 가지고 있는값:"+arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
