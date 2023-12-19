/* File 	  : MatrixMultiplication.java
 * Description: To Multiplle two matrixes
 * Author	  : Doney Siby
 * Version	  : 1.0
 * Date		  : 06/10/2023
 */



package javalab;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main (String [] args) {
    Scanner sc= new Scanner(System.in);
    int ROW_SIZE1,COLUMN_SIZE1,ROW_SIZE2,COLUMN_SIZE2;
    System.out.println("Enter the Row Size and Column Size of Matrix 1:");
    ROW_SIZE1=sc.nextInt();
    COLUMN_SIZE1=sc.nextInt();
    System.out.println("Enter the Row Size and Column Size of Matrix 2:");
    ROW_SIZE2=sc.nextInt();
    COLUMN_SIZE2=sc.nextInt();
    int [][]Matrix1=new int [ROW_SIZE1][COLUMN_SIZE1];
    int [][]Matrix2=new int [ROW_SIZE2][COLUMN_SIZE2];
    int [][]resultantMatrix=new int [ROW_SIZE1][COLUMN_SIZE2];
    int i,j,k;
      if(ROW_SIZE2==COLUMN_SIZE1)
       {
	    System.out.println("Multiplication is possible:");
	    System.out.println("Enter the First Matrix:");
	      for(i=0;i<ROW_SIZE1;i++)
	      {
	    	  for(j=0;j<COLUMN_SIZE1;j++)
	    	  {
	    		  Matrix1[i][j]=sc.nextInt();
	    	  }
	    	  
	      }
	      System.out.println("Enter the Second Matrixl:");
	       for(i=0;i<ROW_SIZE2;i++)
	       {
	    	 for(j=0;j<COLUMN_SIZE2;j++)
	    	 {
	    		 Matrix2[i][j]=sc.nextInt();
	    	 }
	 
	       }
        for(i=0;i<ROW_SIZE1;i++)
        {
        	for(j=0;j<COLUMN_SIZE2;j++)
        	{
        	  resultantMatrix[i][j]=0;
        	  for(k=0;k<ROW_SIZE2;k++)
        	  {
        	   resultantMatrix[i][j]=resultantMatrix[i][j]+Matrix1[i][k]*Matrix2[k][j];
        	  }
        	}
        }
        System.out.println("Resultant Matrix:");
        for(i=0;i<ROW_SIZE1;i++)
        {
        	for(j=0;j<COLUMN_SIZE2;j++)
        	{
        		System.out.print(resultantMatrix[i][j]+" ");
        	}
        	System.out.println();
        }
       }
         else
        {
        	System.out.println("The Matrix Multiplication is not possible");
        }
        
        }
       
       }
      
	
	

