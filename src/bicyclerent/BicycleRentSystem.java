package bicyclerent;

import calculator.*;

public class BicycleRentSystem {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        c.setA(100);
        c.setB(50);
        c.setOperation("+");

        System.out.println(c.calculate());

        System.exit(1);


        Bicycle b1 = new Bicycle();
        b1.setBrand("BMX");
        b1.setMaxGear(18);
        b1.setGear(5);


        Bicycle b2 = new Bicycle();
        b2.setBrand("Schwin");
        b2.setMaxGear(18);
        b2.setGear(18);
        b2.gearUp();


        System.out.println("Bicycle 1: " + b1);
        System.out.println("Bicycle 2: " + b2);

        BicycleDaoSqlite bicycleDao = new BicycleDaoSqlite();
        bicycleDao.makeDBConnection("doc/bicycle.db");
        //bicycleDao.saveBicycle(b1);
        //bicycleDao.saveBicycle(b2);

        Bicycle b = bicycleDao.loadBicycleById(1);
        System.out.println("Loaded bike: " + b);


        /*

        Bicycle b3 = new Bicycle("GT", 18, 5);
        System.out.println(b3);

        System.out.println("Kreiranje terminala ... ");
        Terminal t1 = new Terminal("Vukovarska 33", 12);
        Terminal t2 = new Terminal("Bilogorska 12", 8);


        b1.setTerminal(t1);
        b3.setTerminal(t2);

        System.out.println(b1);
        System.out.println(b3);


        ElectricBicycle eb = new ElectricBicycle("Swin", 18 ,5, 1500);
        eb.setBrand("Pony");
        System.out.println(eb);

        */
    }
}
