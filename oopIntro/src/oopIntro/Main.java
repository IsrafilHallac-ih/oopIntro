package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1=new Product(1,"Lenovo V14",15000,"8GB Ram",10);

		
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setUnitPrice(16000);
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		

		Category category1=new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		

		Category category2=new Category();
		category2.setId(2);
		category2.setName("��ecek");
		
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());

		


		
		
		
		
		

		
	}
}
