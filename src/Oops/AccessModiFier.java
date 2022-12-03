package Oops;
class Banking{
    public String username;
    private String password;
     void setUsername(String username){
        this.username=username;
     }
     void setPassword(String password){
        this.password=password;
     }
     void getPassword(){
        System.out.println(this.password);
     }
}
public class AccessModiFier {
    public static void main(String[] args) {
        Banking b1=new Banking();
        b1.setUsername("navneetlg");
        b1.setPassword("Navnneet7676@%");
        System.out.println(b1.username);
        b1.getPassword();
    }
}
