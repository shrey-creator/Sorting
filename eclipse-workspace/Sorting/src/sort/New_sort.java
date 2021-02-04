package sort;

public class New_sort {

	public static void sort(int[] arrNum)
	   {
	      int number = arrNum.length;
	      for(int a = 1; a < number; ++a)
	      {
	         int keyValue = arrNum[a];
	         int b = a - 1;
	         while(b >= 0 && arrNum[b] > keyValue)
	         {
	            arrNum[b + 1] = arrNum[b];
	            b = b - 1;
	         }
	         arrNum[b + 1] = keyValue;
	      }
	   }
	   static void displayArray(int[] arrNum)
	   {
	      int num = arrNum.length;
	      for(int a = 0; a < num; ++a)
	      {
	         System.out.print(arrNum[a] + " ");
	      }
	      System.out.println();
	   }
	   public static void main(String[] args)
	   {
	      int[] arrInput = { 50, 80, 10, 30, 90, 60 };
	      sort(arrInput);
	      displayArray(arrInput);
	   }
}
