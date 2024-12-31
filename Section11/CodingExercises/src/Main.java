public class Main {

    public static void main(String[] args) {

        ListItem first = new Node("1");
        ListItem second = new Node("2");
        ListItem third = new Node("3");
        ListItem fourth = new Node("4");

        NodeList list = new MyLinkedList(first);
        list.addItem(second);
        list.addItem(third);
        list.addItem(fourth);

        list.traverse(list.getRoot());
    }
}
