
public class Main {
	Integer[] Jan;
	public int SIZE = 20000;
	public int Position1 = 0;
	public int Position2 = 1;

	public Main() {
		init();
	}

	public void randp(int n) {
		Jan = new Integer[n];
		int num = n;
		for (int i = 0; i < n; i++) {
			Jan[i] = num;
			num--;
		}
		shuffle(Jan);
	}

	public static void shuffle(Integer[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int random = i + (int) (Math.random() * ar.length - i);
			swap(ar, i, random);
		}
	}

	private static void swap(Integer[] ar, int a, int b) {
		int temp = ar[b];
		ar[b] = ar[a];
		ar[a] = temp;
	}

	public void init() {
		randp(SIZE);
	}

	public void bubbleSort() {
		for (int i = SIZE - 1; i > 0; i--) {
			for (int j = 0; j != i; j++) {
				if (Jan[j].compareTo(Jan[j + 1]) > 0) {
					swap(Jan, j, j + 1);
				}
			}
		}

	}

	public void SelectionSort() {
		/*
		 * int MaxPosition = 0; int StartingPosition = j; int EndingPosition =
		 * i;
		 */
		for (int i = SIZE - 1; i > 0; i--) {
			int MaxPosition = 0;
			for (int j = 0; j<= i; j++) {
				if (Jan[j].compareTo(Jan[MaxPosition]) > 0) {
					MaxPosition = j;
				}
			}
			swap(Jan, i, MaxPosition);
		}
	}
	public void InsertionSort(){
		for (int i = 1; i < SIZE; i++){
			Integer placeholder = Jan[i];
			int j = i-1;
			while(j>=0 && Jan[j].compareTo(placeholder) > 0){
					Jan[j + 1] = Jan[j];
					Jan[j] = placeholder;
				j--;
			}
		}}
	

	public static void printArray(Integer[] ar) {
		for (Integer I : ar) {
			System.out.print(I + "; ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main sorter = new Main();
		printArray(sorter.Jan);
		sorter.bubbleSort();
		printArray(sorter.Jan);
		sorter.init();
		printArray(sorter.Jan);
		sorter.SelectionSort();
		printArray(sorter.Jan);
		sorter.init();
		printArray(sorter.Jan);
		sorter.InsertionSort();
		printArray(sorter.Jan);
	}

}
