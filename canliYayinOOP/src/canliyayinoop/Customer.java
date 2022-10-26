package canliyayinoop;

public class Customer {

    private int id;
    private String nationalityIdentity;

    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalityIdentity() {
        return nationalityIdentity;
    }

    public void setNationalityIdentity(String nationalityIdentity) {
        this.nationalityIdentity = nationalityIdentity;
    }

}
