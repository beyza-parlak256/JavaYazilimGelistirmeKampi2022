package canliyayinoop;
public class TeacherCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        // hesaplamalar
        System.out.println("Ogretmen kredisi hesaplandı"); 
    }

    @Override
    public void Save() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
