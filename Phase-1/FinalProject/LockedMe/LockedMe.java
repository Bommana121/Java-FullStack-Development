package lockedMe;
import java.io.*;
import java.util.Scanner;

public class LockedMe {

		final static String Folder = "E:\\Files\\";

		public static void main(String[] args) {
			System.out.println();
			System.out.println("**************   Application Name : LockedMe.com   **************\n");
			try {
				Scanner sc = new Scanner(System.in);
				LockedMe q=new LockedMe();
				
				int option;
				do {
					System.out.println("Enter your choice which you want to select: \n");
					System.out.println("\t1. Retrieve current filenames in ascending order \n");
					System.out.println("\t2. Business-level operation menu \n");
					System.out.println("\t3. Exit from the application \n");
					
					option=sc.nextInt();
					switch(option) {
					case 1:
						showFiles();
						break;
					case 2:
						int ch;
						do {
							System.out.println("Enter your choice for Business level operation");
							System.out.println("\t1. Add a file and its content to a directory");
							System.out.println("\t2. Delete a file from a directory");
							System.out.println("\t3. Searching a file and showing its content");
							System.out.println("\t4. Exit from BLO menu");
							
							
							ch=sc.nextInt();
							switch(ch) {
							case 1:
								addFile();
								break;
							case 2:
								deleteFile();
								break;
							case 3:
								searchFile();
								break;
							case 4:
								System.out.println("___________________________________________\n");
								System.out.println("Exited from the Business Level operation...");
								System.out.println("___________________________________________\n");
								break;
							default:
								System.out.println("Invalid Choice");
								break;
							}
						   }
					    while(ch!=4);
					    break;
					case 3:
					    System.out.println("Exiting from the application...");
					    break;
					    default:
					    System.out.println("Invalid choice");
					}
				    }while(option!=3);	
	
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}


		public static void showFiles() {
			File F = new File(Folder);
			File[] files = F.listFiles();
			for(File file : files) {
				if(file.isFile()) {
		
					System.out.println(file.getName());
				}
			}
		}

		public static void addFile() {
			System.out.println("Enter the file which you want to add:");
			Scanner scan=new Scanner(System.in);
			String filename=scan.nextLine();
			File F= new File(Folder+filename+".txt");
			try {
				if(F.createNewFile()) {
					System.out.println(filename+" file is added to the directory");
				}
				else {
					System.out.println("This file is already there");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}


		public static void deleteFile() {
			int t=0;
			Scanner scan=new Scanner(System.in);
			File directory = new File(Folder);
			System.out.println("Enter the file name which you want to delete:");
			String fileName=scan.nextLine();
			File F= new File(Folder+fileName+".txt");
	        File[] files=directory.listFiles();
	        for (File file : files) {
	            String name = file.getName();
	            if (name.equals(fileName+".txt")) {
	            	if(F.delete())
	        			{System.out.println(fileName+" got Deleted");
	        			t=1;}		
	            }
			}
	        if(t==0)
	        	System.out.println("File Not Found");
		}

		public static void searchFile() 
		{

			try {	
				Scanner scan= new Scanner(System.in);	
				File directory = new File(Folder);
				System.out.println("Enter the file name which you want to search:");
				String fileName=scan.nextLine();
		        File[] files=directory.listFiles();
		        int flag=0;
		        for (File file : files) {
		            String name = file.getName();
		            if (name.equals(fileName+".txt")) {
		                    System.out.println("The filename "+fileName+" is present in the directory");
		    				flag=1;	
		            }
				}
			    if(flag==0) {
			    	System.out.println("File not found");
			    }
			    }
			catch(Exception ex) 
				{
				System.out.println("file not found");
				}
		}
}