package canliyayinoop;
public class Main {

    public static void main(String[] args) {
        // instance creation 
        CreditManager creditManager = new CreditManager();
        creditManager.Calculator();
        
        Customer customer = new Customer();
        customer.setId(1000);
        customer.setNationalityIdentity("12345678910"); 
        
        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Add();
        customerManager.Delete();
    
        Company company = new Company();
        company.setTextNumber("123");
        company.setCompanyName("X Acente");
        company.setNationalityIdentity("154628000011");
        
        CustomerManager customerManager1 = new CustomerManager(new Company());
        
        Person person = new Person();
        person.setCity("Hatay");
        person.setFirstName("Beyza");
        person.setLastName("Parlak");
        person.setId(11111);
        person.setNationalityIdentity("12300000000");
    }
    
}
