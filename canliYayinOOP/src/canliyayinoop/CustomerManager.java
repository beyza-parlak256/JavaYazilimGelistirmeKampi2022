package canliyayinoop;

public class CustomerManager {
    private Customer customer;
    
    public CustomerManager(Customer customer){
        this.customer = customer;
    }
    
    public void Save(){
        System.out.println("Müşteri değisiklikleri kaydedildi " + customer.getNationalityIdentity());
    }
    
    public void Add(){
        System.out.println("Müşteri eklendi " + customer.getNationalityIdentity());
    }
    
    public void Delete(){
        System.out.println("Müşteri silindi " + customer.getNationalityIdentity());
    }
}
