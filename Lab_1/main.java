package Lab_1;



public class main {
 
 public static void main (String[] agrs) {
     Bank mono = new Bank();
     Bank privat = new Bank("Privat", "Zelena", 9);
     Bank alpha = new Bank("Alpha Bank", 100, 76, "Orangeva", 5, "Ukraine");
     
     
     System.out.println(mono.toString());
     System.out.println(privat);
     System.out.println(alpha);
 
  }

} 