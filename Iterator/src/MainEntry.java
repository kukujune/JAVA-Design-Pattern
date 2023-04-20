public class MainEntry {

    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU", 1000),
                new Item("Keyborad", 2000),
                new Item("Mouse", 3000),
                new Item("HDD", 500),
        };

        Array array = new Array(items);
        Iterator it = array.Iterator();

        while(it.next()){
            Item item = (Item) it.current();
            System.out.println(item);
        }

    }
}
