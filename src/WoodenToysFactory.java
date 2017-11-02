
//еще одна конткретная фабрика
public class WoodenToysFactory implements ToyFactory {
    public Bear getBear(){
        return new WoodenBear();
    }
    public Cat getCat(){
        return new WoodenCat();
    }
}
