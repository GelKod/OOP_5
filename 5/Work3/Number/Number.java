package Work3.Number;

import java.io.*;
import java.lang.reflect.Method;

import Work3.DuplicateModelNameException;
import Work3.NoSuchModelNameException;
import Work3.Car.Car;
import Work3.Moped.Moped;
import Work3.Motoricle.Motoricle;
import Work3.Qwadracikle.Qwadracikle;
import Work3.Scuter.Scuter;
import Work3.VehicleUtils.VehicleUtils;
import Work3.Vehicle.Vehicle;

public class Number {
    public static void main(String[] args) throws Exception{
        
        Vehicle c = new Car("Pezho", 5);
        Vehicle m = new Motoricle("BMW", 6);

        // 5 lab

        //1
        // Reader r = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(r);
        // System.out.println("Введите название класса: ");
        // String nameClass = br.readLine();
        // System.out.println("Введите метод: ");
        // String nameMetod = br.readLine();
        // System.out.println("Введите первый параметр: ");
        // String oldName = br.readLine();
        // System.out.println("Введите vtoroi: ");
        // double price = Double.parseDouble(br.readLine());
        // Class<?> newClass =  Class.forName(nameClass);
        // Object temp = newClass.getConstructor(String.class, int.class).newInstance("Nissan", 2);
        // Method tmp = newClass.getMethod(nameMetod, String.class, double.class);

        //2
        // tmp.invoke(temp, oldName, price);
        // System.out.println(temp);
        // System.out.println();

        //3
        Vehicle sc = new Scuter("Yamaha", 3);
        sc.addModel("j2", 800000);
        sc.ModifName("j2", "k1");
        sc.setModelPrice("k1", 1100000);
        System.out.println(sc);
        
        //4
        System.out.println();
        Vehicle q = new Qwadracikle("bmv", 3);
        q.addModel("x5", 3500000);
        q.ModifName("x7", "x5");
        q.setModelPrice("x7", 82000);
        System.out.println(q);

        //5
        System.out.println();
        Vehicle mop = new Moped("audi", 3);
        mop.addModel("m9", 34500);
        mop.ModifName("m6", "m9");
        mop.setModelPrice("m6", 7876000);
        System.out.println(mop);

        //6
        System.out.println(VehicleUtils.getAverageClassesPrice(c,m,q,mop,sc));

        //7

        VehicleUtils.writeVehicle(mop, new FileWriter("235.txt"));       
        Vehicle b = VehicleUtils.readVehicle(new FileReader("235.txt"));
        System.out.println(b);
    }
}