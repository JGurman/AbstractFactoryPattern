public class Test {

    public static void main(String[] args) {
        //сначала создадим деревянную фабрику
        ToyFactory toyFactory = new WoodenToysFactory();
        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();
        System.out.printf("I've got %s and %s", bear.getName(), cat.getName());
        //вывод на консоль будет: [I've got Wooden Bear and Wooden Cat]

        //а теперь создадим "плюшевую фабрику", следующая линейка яляется единственной разницей в коде
        ToyFactory toyFactory1 = new TeddyToyFactory();
        //как видим код ниже не отличаеться от приведенного выше
        Bear bear1 = toyFactory1.getBear(); Cat cat1 = toyFactory1.getCat();

        System.out.printf("I've got %s and %s", bear1.getName(),  cat1.getName());
        //вывод на консоль будет другой:[I've got Teddy Bear and Teddy Cat]
    }
}
