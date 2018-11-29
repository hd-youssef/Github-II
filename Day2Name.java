import java.util.ArrayList;
public class Day2Name{



	public static void main(String[]args){


		System.out.println("youssef");


		System.out.println("purple is for royalty darling, not middle management - myrtle snow, american horror story");

		System.out.println("tanav");
		System.out.println("merge conflict incoming");

		ArrayList<Integer> test = new ArrayList<>();

		test.add(8);
		test.add(9);
		test.add(5);
		test.add(0);

		System.out.println(test);
		System.out.println(reconstruct(test));

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