import java.util.*;
class ArraysOperstion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		/*// 1-D array
		System.out.println("Enter the no element");
		int num = sc.nextInt();
		System.out.println("Enter the array element");
		int arrr[] = new int[num];
		for(int i =0; i<num;i++){
			arrr[i] = sc.nextInt();
		}
		System.out.println("Entered array element are:- "+Arrays.toString(arrr));
		
		// 2-D Array
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of coloumn");
		int col = sc.nextInt();
		System.out.println("Enter the array element");
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Array Element are" );
		for(int i=0;i<row;i++){
			for(int j=0; j<col; j++){
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}*/
		
		//  Entering a new value in array
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the array element");
		int[] arr = new int[size];
		int[] newArray = new int[size+1];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array element are:- "+Arrays.toString(arr));
		
		System.out.println("Enter the position for the elemented to be inserted");
		int pos = sc.nextInt();
		int index = pos-1;
		System.out.println("Enter the element");
		int newElement = sc.nextInt();
		
		for(int i = 0; i< arr.length+1;  i++){
			if(i < index){
				newArray[i] = arr[i];
			} else if(i ==index){
				newArray[i] = newElement;
			} else{
				newArray[i] = arr[i-1];
			}
		}
		System.out.println("");
		System.out.println("Array element are after inserting:-  "+Arrays.toString(newArray));
		System.out.println("");
		
		// Deleting An arrayElement
		System.out.println("Enter the position for the element to be deleted");
		int position = sc.nextInt();
		int index1 = position-1;
		int[] deletedArray  = new int[size];
		for(int i = 0; i<newArray.length-1; i++){
			if(i < index1){
				deletedArray[i] = newArray[i];
			} else{
				deletedArray[i] = newArray[i+1];
			}
		}
		System.out.println("");
		System.out.println("Array element are after deleting:-  "+Arrays.toString(deletedArray));
	}
}