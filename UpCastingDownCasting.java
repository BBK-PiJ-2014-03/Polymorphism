public class UpCastingDownCasting {
    
    public static void main(String[] args) {
        
        MobilePhone myPhone = new SmartPhone("Nokia");
        
        System.out.println(myPhone);
        
        myPhone.playGame("Pokemon");
        myPhone.browseWeb("www.bbc.co.uk");
        myPhone.call("02020");
        myPhone.call("00123456789");
    }
}