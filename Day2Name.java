import java.util.ArrayList;
public class Day2Name{



	public static void main(String[]args){

		int num = (int)(Math.random()*10000);

		System.out.println(num);
		System.out.println(covertToArrayList(num));

		ArrayList<Integer> test = new ArrayList<>();

		test.add(8);
		test.add(9);
		test.add(5);
		test.add(0);

		System.out.println(test);
		System.out.println(reconstruct(test));

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



	}

	//method 2 youssef
	public static int reconstruct (ArrayList<Integer> a){

		int combinary = 0;

		for(int i=0; i<a.size(); i++){
			int poppy = (a.size()-1) - i;
			int mult = 1;
			int value = a.get(i);
			while(poppy>0){
				mult*=10;
				poppy--;
			}
			value*=mult;
			combinary+=value;
		}

		return combinary;
	}

	}

