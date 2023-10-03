package array;

public class Ex2 {

	public static void main(String[] args) {
		
		
		int[][] scores = new int[3][3];
		scores[0][2] = 100;
		scores[1][1] = 180;
		
		//初期化 状态 kakikata
		int[][] array2D = {{1,2},{7,9},{3,5}};
		
		
		System.out.println(array2D[1][1]);
		//zong
		System.out.println(array2D.length);
		//heng
		System.out.println(array2D[0].length);
		
	}

}
