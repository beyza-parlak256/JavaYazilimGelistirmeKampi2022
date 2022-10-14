package oop1;
// OOP = Nesne Yönelimli Programlama

public class oop1 {

    public static void main(String[] args) {

        // set value (değer atama)
        // get (okuma)
        // set value (değer atama)
        // Class tanımlama 
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setImageUrl("image1.jpg");
        product1.setUnitInStock(10);
        product1.setUnitPrice(5999);
        Product product2 = new Product();
        product2.setName("Selm Kahve Makinesi");
        product2.setDiscount(15);
        product2.setImageUrl("image2.jpg");
        product2.setUnitInStock(15);
        product2.setUnitPrice(4500);
        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(0);
        product3.setImageUrl("image3.jpg");
        product3.setUnitInStock(3);
        product3.setUnitPrice(8000);
        
        Product[] products = {product1, product2, product3};
        
        System.out.println("<ul>");
        // producların hepsini dön demek
        for(Product product : products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");
        
        
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("053012345");
        individualCustomer.setFirstName("Beyza");
        individualCustomer.setLastName("Parlak");
        
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("15267");
        corporateCustomer.setPhone("053912345");
        corporateCustomer.setCompanyName("Parlak.io");
        corporateCustomer.setTaxNumber("111111111111");
        
        Customer[] customers = {individualCustomer,corporateCustomer};
        
    }
}







