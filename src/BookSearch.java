

	import java.util.*;
	 /*
	 * This application can calculate the total amount your payment for items entered plus tax
	 * @author mahderf
	 */
	public class BookSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//entering our book information to the array
		String []sku= {"Java1001","Java1002","Orcl1003","python1004","Zombie1005","Rasp1006","math1007" };
		String[]title= {"Head First Java", "Thinking in Java","OCP:Oracle Certified Proffessional Java SE","Automate the Bouring Stuff with Phyton","The Maker's Guide to the Zombie Apocalypse", "Rapberry Pi Projects for the Evil Genius","Introduction to Mathimatics"};
		String[]author= {"Kathy Sierra and Bert Bates","Bruce Eckel","Jeanne Boyarsky","Al Sweigart","Simon Monk","Donald Norris","Bruce Eckel"};
		String[]discription= {"Easy to read Java workbook","Details about Java under the hood","Everything you need to know in one place","Fun with Python","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi","A dozen fiendishly fun projects for the Raspberry Pi!","Guide to Calulus"};
		double[]price= {47.50,20,45,10.50,16.5,14.75,20};
		//boolean cont=true;
		
		//Creating book object and a scanner
		Scanner scan=new Scanner(System.in);
		book bk=new book();
	  
		System.out.println("Write down the SKU of the book you are looking for");
		String response=scan.nextLine();
		
		//the for loop checks the if the sku is in the database and adds all book sets all the book information for the SKU to the method
		for (int arrno =0; arrno<6;arrno++)
		{
			
		if(sku[arrno].equalsIgnoreCase(response))
		{
			bk.setSku(sku[arrno]);
			bk.setTitle(title[arrno]);
			bk.setAuthor(author[arrno]);
			bk.setDiscription(discription[arrno]);
			bk.setPrice(price[arrno]);
			
		}
		}
		//prints out the searched book's information
		System.out.println("The SKU you put in is: "+bk.getSku() +'\n'+ "The Title of the book is: "+bk.getTitle()+'\n'+ "The Author of  the book is: "+bk.getAuthor()+ '\n'+ "Discription: "+bk.getDiscription()+'\n'+ "The Price is: "+"$"+bk.getPrice());
		
		}
	
	

}
