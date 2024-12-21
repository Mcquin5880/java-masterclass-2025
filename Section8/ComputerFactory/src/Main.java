public class Main {

    public static void main(String[] args) {

        ComputerCase pcCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard mb = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer pc = new PersonalComputer("2208", "Dell", monitor, mb, pcCase);

        pc.powerUp();
    }
}
