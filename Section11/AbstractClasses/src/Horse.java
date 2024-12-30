public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType());
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }
}
