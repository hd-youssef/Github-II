import java.util.ArrayList;

public class Day2Name{
	public static void main(String[]args){

		int num = (int)(Math.random()*10000);

		System.out.println(num);
		System.out.println(covertToArrayList(num));

	}

	public static ArrayList<Integer> covertToArrayList(int x){
		ArrayList<Integer> list = new ArrayList<Integer>();

			if(x >= 1000){
				list.add(x/1000);
				x = x%1000;
			}
			if(x >= 100){
				list.add(x/100);
				x = x%100;
			}
			if(x >= 10){
				list.add(x/10);
				x = x%10;
			}
			if(x >= 0)
				list.add(x);

				return list;

	}//covertToArrayList
}