package fileHandling;
import java.io.*;
import java.util.Scanner;

public class FileHandling {

	 public static void main(String[] args)
	 {	  
		  System.out.println("Enter the choice : ");
		  System.out.println("1. Create new file \n 2. Read File \n 3. Write to a file \n 4. Append to a file");
		  Scanner sc = new Scanner(System.in);
		  int n= sc.nextInt();
		 
		  
		  if(n==1)
		  {
			 try 
			 {
			       File myObj = new File("C:\\Users\\B CHARAN\\OneDrive\\Desktop\\filename.txt");
			       if (myObj.createNewFile()) 
			       {
			         System.out.println("File created: " + myObj.getName());
			       }
			       else
			       {
			         System.out.println("File already exists........");
			       }
			  } 
			  catch (IOException e)
			  {
			        System.out.println("An error occurred........");
			        e.printStackTrace();
			  }
		  }
		  else if(n==2)
		  {
			  try 
			  {
			    	File myObj = new File("C:\\Users\\B CHARAN\\OneDrive\\Desktop\\filename.txt");
			    	Scanner myReader = new Scanner(myObj);
			    	while (myReader.hasNextLine()) 
			    	{
			        String data = myReader.nextLine();
			        System.out.println(data);
			      	}
			    	myReader.close();
			   } 
			   catch (FileNotFoundException e) 
			   {
			    	System.out.println("An error occurred........");
			    	e.printStackTrace();
		       }
		  }
		  
		  else if(n==3)
	      {
		      try 
		      {
			        FileWriter myWriter = new FileWriter("C:\\Users\\B CHARAN\\OneDrive\\Desktop\\filename.txt");
			        myWriter.write("Java is an Object Oriented Programming language ...");
			        myWriter.close();
			        System.out.println("Successfully wrote to the file.......");
		      } 
		      catch (IOException e) 
		      {
			      System.out.println("An error occurred.........");
			      e.printStackTrace();
			  }
		  }
	      else if(n==4)
	      {
			  try 
			  {
					FileWriter myWriter = new FileWriter("C:\\Users\\B CHARAN\\OneDrive\\Desktop\\filename.txt", true);
					myWriter.write("Java has the concept of multithreading...");
					myWriter.close();
					System.out.println("Successfully appended to the file.......");
			  } 
			  catch (Exception e) 
			  {
					System.out.println("File append error.........");
			  }
		   }
		   else 
			   System.out.println("Wrong choice........");
				
			}
		}
		
			
