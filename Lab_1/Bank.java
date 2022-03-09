package Lab_1;


public record Bank(String bank_name, int bank_clients, int bank_made_credits,
         String bank_address, int bank_rate, String bank_country ) {

  public Bank() {
   this("Mono", 350, 300,"Chervona",10,"Ukraine"); //конструктор без параметрів
 }

  public Bank(String bank_name, String bank_address, int bank_rate) {
   this(bank_name, 123, 124, bank_address, bank_rate, "Ukraine" ); //конструктор приймає 3 параметра
 }

 public static int bank_stores = 24; // статичне поле

 public static int bank_stores() {

 return bank_stores;   // статичний метод який повертає статичне поле

 }




@Override 
 public String toString() {

 return "Name: "+ bank_name + " Clients: " + bank_clients + " Made Credits: " + bank_made_credits +
 " Address: " + bank_address + " Rate: " + bank_rate + " Country: " + bank_country; // перевизначений метот toString

 }

}