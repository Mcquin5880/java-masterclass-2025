public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Default Name", 0, "Default email");
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println(c1);

        Customer c2 = new Customer("Michael", "m@gmail.com");
        System.out.println(c2);

        Customer c3 = new Customer("John", 10000, "jd@gmail.com");
        System.out.println(c3);
    }
}
