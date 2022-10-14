package intro;
public class Intro {
    public static void main(String[] args) {
        
        // DEGİSKENLER, KARAR YAPILARI, DONGULER
        
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";
        
        System.out.println(ortaMetin);
        
        double dolarDun = 18.14;
        double dolarBugun = 18.10;
        boolean dolarDustuMu = false;
        
        String okYonu = "";
        
        if(dolarBugun < dolarDun){
            okYonu = "down.svg";
            //System.out.println(okYonu);
        }
        else if(dolarBugun > dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else{
            okYonu = "equals.svg";
            System.out.println(okYonu);
        }
        
        
        // ARRAYS 
        String[] marka ={"Asus","Monster","HP","Lenovo","Acer","Apple","MSI","Dell","Huawei","Razer"};
        System.out.println("\nLaptop Markaları");
        for(int i=0; i<marka.length; i++){
            System.out.println(marka[i]);
        }
        
        
    }
    
}


