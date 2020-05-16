package Read;
public class array_com
{
	public static void method1(int array1[],int array2[])//To create a method1 for finding common element between two arrays
	{
	int i,j;//declaration of elements
	int k=0;//declaration and initialisation of element k
	for(i=0;i<array1.length;i++)//outer loop
	{
		for(j=0;j<array2.length;j++)//inner loop
		{
			if(array1[i]==array2[j])//comparision of elements 
			{
					k=array1[i];//inserting common element into k
			}
		}
	}
	System.out.println("The common elements between two array is"+" "+k);

	}		
public static void main(String args[])
	{
	int a[]={1,2,3};//initilization of array1[]
	int b[]={3,4,5};//initialization of array2[] 
	method1(a,b);//Calling static method ;no need to create object for this class
	}
}