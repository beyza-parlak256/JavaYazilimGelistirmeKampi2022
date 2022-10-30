package inheritancedemo;
public class InheritanceDemo {
    public static void main(String[] args) {
        // değişime direnmeyen programlar yazmalıyız...
        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculator(new BaseCreditManager());
        
        
    }
    
}
