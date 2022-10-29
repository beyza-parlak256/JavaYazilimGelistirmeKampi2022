package canliyayinoop;

public class CustomerManager {
    private Customer customer;
    private ICreditManager _CreditManager;
    
    public CustomerManager(Customer customer, ICreditManager creditManager){
        this.customer = customer;
        this._CreditManager = creditManager;
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
    
    public void giveCredit(){
        _CreditManager.Calculate();
        System.out.println("Kredi verildi");
    }
}
