package user;
public class main {
    public String username;
    public String password;
    
    public main (String username, String password){
    this.username= username;
    this.password= password;
    }
    
         public static void main(String[] args) {
        main petani = new main("petanikode", "kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);}
         
User Harto = new User();{
Harto .setUsername("Alpha");
Harto .setPassword("UwU");

System.out.println("Username: " + Harto.getUsername());
System.out.println("Password: " + Harto.getPassword());
}

}

