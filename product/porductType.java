package product;
import java.util.Scanner;
 class productinfo{
	 int productId;
	   String productName;
	   double productPrice;
	 public  void setProductData(int id, String name, double price) {
		 productId=id;
		 productName=name;
		 productPrice=price;
	 }
	 public void getProductData() {
		 
		 System.out.println("Enter product name:"+ productId);
		 System.out.println("Enter product name:"+ productName);
		 System.out.println("Enter product name:"+ productPrice);
	  
	  
	 }
 }

public class porductType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		double price=sc.nextDouble();
		
		// TODO Auto-generated method stub
	
		productinfo pro = new productinfo();
		pro.setProductData(Id,name,price);
		pro.getProductData();
		sc.close();
		

	}

}
