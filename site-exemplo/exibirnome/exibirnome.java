

public class exibirnome {
    
    public static void main(String[] args){

        User  userA = new User();
        userA.firstName = "Marco";
        userA.LastName = "Antonio";
        String fullName = userA.getFullName();
   
        System.out.println(fullName);
   
       }
}
