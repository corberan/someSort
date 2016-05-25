import java.util.Random;

class Main{
	public static void main(String[] args){
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		Random rand = new Random();
		for(int i = 0; i < 20; i++){
			int value = rand.nextInt(100);
			list1.add(value);
			System.out.print(value + "\t");
		}

		System.out.println();

		for(int j = 0; j < 15; j++){
			int value = rand.nextInt(1000);
			list2.add(value);
			System.out.print(value + "\t");
		}

		System.out.println("\n");

		// LinkedList firstList, secondList;
		// try{
		// 	if (list1.get(0) <= list2.get(0)){
		// 		firstList = list1;
		// 		secondList = list2;
		// 	}else{
		// 		firstList = list2;
		// 		secondList = list1;
		// 	}
		// }catch(IndexOutOfBoundsException ex){
		// 	ex.printStackTrace();
		// }
		

		LinkedList resultList = new LinkedList();
		int indexFirst, indexSecond;
		indexFirst = indexSecond = 0;
		while (indexFirst < list1.size() && indexSecond < list2.size()){
			try{
				int value1 = list1.get(indexFirst);
				int value2 = list2.get(indexSecond);
				if(value1 <= value2){
					resultList.add(value1);	
					indexFirst++;
					if (value1 == value2){
						resultList.add(value2);			
						indexSecond++;
					}
				}else{
					resultList.add(value2);
					indexSecond++;
				}
			}catch(IndexOutOfBoundsException ex){
				ex.printStackTrace();
			}
		}

		try{
			if (indexFirst < list1.size()){
				for (int i = indexFirst; i < list1.size(); i++){
					resultList.add(list1.get(i));
				}
			}

			if (indexSecond < list2.size()){
				for (int i = indexSecond; i < list2.size(); i++){
					resultList.add(list1.get(i));
				}
			}

		}catch(IndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
		


		for (int i = 0; i < resultList.size(); i++){
			try{
				System.out.print(resultList.get(i) + "\t");
			}catch(IndexOutOfBoundsException ex){
				ex.printStackTrace();
			}
		}

		System.out.println();
		
	}
}

