
public class Main {

	public static void main(String[] args) {
		 Ball G = new Ball();
			
			G.setBrand();
			G.setColor();
			G.setsportType();
			G.setMaterial();
			G.setSize();
			G.setprice();
			G.setQuantity();
			G.setweight();
			
			System.out.println("Brand: " + G.getBrand());
			System.out.println("Color: " + G.getColor());
			System.out.println("Sport Type: " + G.getsportType());
			System.out.println("Material: " + G.getMaterial());
			System.out.println("Size : " + G.getSize());
			System.out.println("Price: RM " + G.getprice());
			System.out.println("Quantity: " + G.getQuantity());
			System.out.println("Weight: " + G.getweight() + "g");
			System.out.println("Total price: RM " + G.getTotalprice());
			
			System.out.println();
			
			    Ball S = new Ball();
				
			    S.setBrand();
				S.setColor();
				S.setsportType();
				S.setMaterial();
				S.setSize();
				S.setprice();
				S.setQuantity();
				S.setweight();
				
				System.out.println("Brand: " + S.getBrand());
				System.out.println("Color: " + S.getColor());
				System.out.println("Sport Type: " + S.getsportType());
				System.out.println("Material: " + S.getMaterial());
				System.out.println("Size : " + S.getSize());
				System.out.println("Price: RM " + S.getprice());
				System.out.println("Quantity: " + S.getQuantity());
				System.out.println("Weight: " + S.getweight() + "g");
				System.out.println("Total price: RM " + S.getTotalprice());
		}

}
