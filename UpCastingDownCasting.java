public class UpCastingDownCasting {
    
    public static void main(String[] args) {
        
        UpCastingDownCasting test = new UpCastingDownCasting();
        
        Phone userPhone = new SmartPhone("Nokia");
        
        /* System.out.println(myPhone);
        
        myPhone.playGame("Pokemon");
        myPhone.browseWeb("www.bbc.co.uk");
        myPhone.call("02020");
        myPhone.call("00123456789"); */
        
        test.testPhone(userPhone);
    }
    


    public void testPhone(Phone newPhone) {
        /* newPhone.playGame("The Sims"); */
        /* newPhone.browseWeb("www.bbc.co.uk"); */
        newPhone.call("3423");
        newPhone.call("00987654321");
    }
}