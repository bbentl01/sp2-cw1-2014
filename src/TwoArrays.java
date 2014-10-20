import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
	
private static Scanner input;

public static void main(String[] args) 
{
	final int amt = 100;
	
	int[] array1 = new int[amt];
	int[] array2 = new int[amt];
	
	

	for (int i = 0; i < array1.length; i++){
		input = new Scanner(System.in);
		System.out.print("Enter data for array 1 (0 to finish):");
        array1[i] = new Scanner(System.in).nextInt();
        
        if (array1[i] ==0){
        	break;
        }
    }

	for (int i = 0; i < array2.length; i++){
		input = new Scanner(System.in);
		System.out.print("Enter data for array 2 (0 to finish):");
        array2[i] = input.nextInt();
        
        if (array2[i] ==0){
        	break;
        }
    }
	
	if(array1[0]==0 && array2[0]==0)
	{
		System.out.println("Both arrays are empty");
	}
	else
	{
	System.out.println("Values for array 1 is:" + ArrayToString(CheckMultipleValues(array1)));
	System.out.println("Values for array 2 is:" + ArrayToString(CheckMultipleValues(array2)));
	System.out.println("Common data is:" + ArrayToString(CommonData(array1, array2)));
	System.out.println("Number of common data is:" + CountCommonData(array1, array2));
	System.out.println("Non-common values for array 1 is:" + ArrayToString(NonCommonData(array1, array2)));
	System.out.println("Non-common values for array 2 is:" + ArrayToString(NonCommonData(array2, array1)));
	}
}

public static String ArrayToString(int[] array)
{
	String str = Arrays.toString(array);
	str = str.replace("]", "");
	str = str.replace("[", "");
	str = str.replace(", 0", "");
	str = str.replace(",","");
	return str;
}

public static int[] CheckMultipleValues(int[] array)
{
	int[] result= new int [array.length];
	int k=0;
	boolean status = true;
	
	for (int i=0; i<array.length; i++){
		status = true;
		for(int j=0; j < k; j++){
			if(array[i] == result[j]){
				status = false;
				break;
			}
		}
		
		if(status){
			result[k] = array[i];
			k++;
		}
	}
	
    return result;
}

public static int[] CommonData(int[] array1, int[] array2)
{
    int[] result = new int[100];
    int k=0;
	
    for (int i = 0; i < array1.length; i++) {
    	for (int j =0; j < array2.length; j++)
    	{
    		if (array1[i] == array2[j]) {
    			result[k] = array1[i]; 
    			k++;
    			break;
              }                 
        }
    }
    
    return result;
}

public static String CountCommonData(int[] array1, int[] array2)
{
    int[] result = new int[100];
    int k=0;
	
    for (int i = 0; i < array1.length; i++) {
    	for (int j =0; j < array2.length; j++)
    	{
    		if (array1[i] == array2[j] && array1[i] != 0 && array2[j] != 0) {
    			result[k] = array2[j]; 
    			k++;
    			break;
              }                 
        }
    }
    
    return Integer.toString(k);
}

public static int[] NonCommonData(int[] array1, int[] array2)
{
    int[] result = new int[100];
    int k=0;

	
    for (int i = 0; i < array1.length; i++) {
        
    	boolean status = false;
    	
    	for (int j =0; j < array2.length; j++)
    	{
    		if (array1[i] == array2[j] && array1[i] != 0 && array2[j] != 0) {
    			status = true;
    			break;
              }                 
        }
		if(status == false){
			result[k] = array1[i];
			k++;
		}
    }
    
    return result;
}

}


