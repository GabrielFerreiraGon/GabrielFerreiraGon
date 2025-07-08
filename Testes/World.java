public class World{
    //ATRIBUTOS
    public String name;
    public int age;
    public double size;

    void info(){ //Method
        System.out.println("NOME DO CACHORRO: " + name );
        System.out.println("IDADE DO CACHORRO: " + age);
        System.out.println("TAMANHO DO CACHORRO: " + size);
    }

    void bark(){
        System.out.println("the dog is barking");
    }

    public static void main(String[] args) {

    //instãncia
    World Cao = new World();

    //ATRIBUTOS
    Cao.name = "Stiv";
    Cao.age = 12;
    Cao.size = 1.23;

    //CALLING METHOD
    Cao.info();
    Cao.bark();

}
}