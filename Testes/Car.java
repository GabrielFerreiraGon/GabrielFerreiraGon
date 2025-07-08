public class Car {
    int year;
    int age;
    String name;

    //Polimorfismo
    Car(int year,int age,String name){
        this.year = year;
        this.name = name;
        this.age = age;
    }
    void info(){ //Method
        System.out.println(name);
        System.out.println(year);
    }
    
    int modific_year(int year){
        this.year = year;
        return year;
    }

    //this are two examples of instancias 
    public static void main(String[] args){
        Car Carro = new Car(2008,32,"ASTRA");
        Carro.info();

        Car Carro2 = new Car(2011,23,"PALIO");
        //Carro2.info();
        //Carro2.get_year(233333);
        System.out.println(Carro2.year);
        Carro2.modific_year(10000);
        System.out.println(Carro2.year);
        System.out.println("Agora o carro tem :" + Carro2.modific_year(3443434));
        Carro2.year = 2;
        Carro2.info();

    }
}
