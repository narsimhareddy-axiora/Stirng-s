package String;

public class Stringallmethods {

	public static void main(String[] args) {

//      String s =  "Welcome";
//     System.out.println(s.length());    // length
//     
     
     String s1 = "Narsimha";
     String s2 = "Narsimha";
     
//     System.out.println(s1.concat(s2).concat(s));    // concat
     
//     
// System.out.println("Before trimming =" + s.length());      //trim
// System.out.println(s.trim());
// System.out.println("After trimed = " +   s.trim().length());
     
//     System.out.println(s.charAt(6));   //charAt
     
//    System.out.println(s.contains("Welcome"));
//    System.out.println(s.contains("Wel"));             //contains
 //    System.out.println(s.contains("Come"));
    
     System.out.println(s1 == s2);
     System.out.println(s1.equals(s2));       //equals
     System.out.println(s1.equals("narsimha"));
     System.out.println(s1.equalsIgnoreCase("narsimha")); // equalignorecase
     
     
     String s = "Welcome to Hyderabad Narsimha Reddy";  
  System.out.println(s.replace('a', '2'));  // replace
  
  String k = "welcome";
  System.out.println(k.substring(0,4));  // substring
  System.out.println(k.substring(1, 3));
     
  
  
 System.out.println(k.toUpperCase());
 System.out.println(k.toLowerCase());
 
 
 
		

	}

}
