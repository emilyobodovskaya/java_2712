public class Person{

    public String firstName;
    public String lastName;
    public String city;
    public String phonenumber;

    public Person (String a, String b, String c, String d) {
        firstName = a;
        lastName = b;
        city = c;
        phonenumber = d;
    }

    public void personInfo() {
        System.out.println("Зателефонувати громадянину " + firstName +" "+ lastName + " із міста "  + city+ " можна за номером " + phonenumber);
    }
}