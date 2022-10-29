package canliyayinoop;

public class MilitaryCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
       // hesaplamalar
        System.out.println("Asker kredisi hesaplandı");  
    }

    @Override
    public void Save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
