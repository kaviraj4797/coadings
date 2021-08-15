import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    int i;
    
    // Enter username and press Enter
    System.out.println("Enter username");
    userName = myObj.nextLine();
    j=myObj.nextint();
    System.out.print("Username is: " + userName);        
    for(i=0;i<=4;i++){
        int k=userName.charAt(i);
        System.out.println(k);
        if (Character.isDigit(k)){
            System.out.println("k");
        }
        else{
            System.out.println("l");
        }
        
        
    }
  }
}
