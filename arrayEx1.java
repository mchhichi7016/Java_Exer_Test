package array;

public class Ex1 {

	public static void main(String[] args) {
		// 配列宣言（数组的声明）
		int[] scores;
		//箱 准备
		scores = new int[3];
		//值的代入
		scores[0] = 100;
		
		//值的内容 wo 确认
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		//省略的写法1
		int[] scores2 = new int[4];
		
		//省略的写法2
		int[] scores3 = new int[] {22,23,100,66};
		
		//省略的写法3(kanarazu)继续记住
		int[] scores4 = {22,33,55};
		System.out.println(scores4.length);
		
		//エラーを出す
		//ArrayIndexOutOfBoundsException
		System.out.println(scores4[4]);
		
		

	}

}
