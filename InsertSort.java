import java.util.Random;

class InsertSort{
	public static void main(String[] args){

		int max = 30;
		int[] array = new int[max]; 

		Random rand = new Random();
		for(int i=0;i<max;i++){
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + "\t");
		}

		System.out.println("\n");

		int temp = 0;
		for (int next = 1; next < max; next++){
			for (int index = 0; index < next; index++){
				if (array[next] < array[index]){
					temp = array[next];
					for (int i = next; i > index; i--){
						array[i] = array[i-1];
					}
					array[index] = temp;
				}
			}
		}

		for(int i=0;i<max;i++){
			System.out.print(array[i] + "\t");
		}

	}
}