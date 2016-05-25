import java.util.Random;

class BubbleSort{
	public static void main(String[] args){
		// System.out.println("汉字");
		int max = 30;
		int[] array = new int[max]; 

		Random rand = new Random();
		for(int i=0;i<max;i++){
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + "\t");
		}

		System.out.println("\n");

		int swapCount = 0;
		int temp = 0;
		for (int maxLen = max; maxLen > 1; maxLen--){
			for (int index = 1; index < maxLen; index++){
				if (array[index] < array[index-1]){
					temp = array[index];
					array[index] = array[index-1];
					array[index-1] = temp;
					swapCount++;
				}
			}
		}

		// int maxIndex, nextIndex;		
		// int len = max;
		// while(len>1){
		// 	maxIndex = 0;
		// 	nextIndex = maxIndex + 1;
		// 	int temp;		
		// 	while(nextIndex < max){
		// 		if (array[maxIndex] > array[nextIndex]){
		// 			temp = array[nextIndex];
		// 			array[nextIndex] = array[maxIndex];
		// 			array[maxIndex] = temp;
		// 		}
		// 		maxIndex = nextIndex;
		// 		nextIndex++;
		// 	}
		// 	len--;
		// }
		
		// for (int nextIndex = 0; nextIndex < max; nextIndex++){
		// 	if (array[maxIndex] < array[nextIndex])
		// 	// for (int nextIndex=1; ; ) {
				
		// 	// }
		// }
		for(int i=0;i<max;i++){
			System.out.print(array[i] + "\t");
		}

		System.out.println("共交换" + swapCount + "次");
	}
}