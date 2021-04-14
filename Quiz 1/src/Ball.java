import java.util.Scanner;
public class Ball {
	String Brand, Color, sportType, Material, Size;
	double price, Totalprice;
	int weight, Quantity;
	Scanner sc = new Scanner(System.in);
	
	 public void setBrand() {
		 System.out.println("Enter the Brand : ");
	    	this.Brand = sc.nextLine();
	    }
	 public void setColor() {
		 System.out.println("Enter the Color : ");
	    	this.Color =sc.nextLine();
	    }
	 public void setsportType() {
		 System.out.println("Enter the sportType : ");
	    	this.sportType = sc.nextLine();
	    }
	 public void setMaterial() {
		 System.out.println("Enter the Material : ");
	    	this.Material = sc.nextLine();
	    }
	 public void setSize() {
		 System.out.println("Enter the Size : ");
	    	this.Size = sc.nextLine();
	    }
	 public void setprice() {
		 System.out.println("Enter the price : ");
		 this.price = sc.nextDouble();
	 }
	 public void setweight() {
		 System.out.println("Enter the Weight : ");
		 this.weight = sc.nextInt();
	 }
	 public void setQuantity() {
		 System.out.println("Enter the Quantity : ");
		 this.Quantity = sc.nextInt();
	 }
	 
	 
	 public String getBrand() {
		 return this.Brand;
	 }
	 public String getColor() {
		 return this.Color;
	 }
	 public String getsportType() {
		 return this.sportType;
	 }
	 public String getMaterial() {
		 return this.Material;
	 }
	 public String getSize() {
		 return this.Size;
	 }
	 public int getweight() {
		 return this.weight;
	 }
	 public double getprice() {
		 return this.price;
	 }
	 public int getQuantity() {
		 return this.Quantity;
	 }
	 public double getTotalprice() {
		 this.Totalprice = this.price * this.Quantity;
		 return this.Totalprice;
	 }
	
}
