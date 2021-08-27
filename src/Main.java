import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /*
        //prducto
        Producto producto = new Producto("123sD","Teclado nashi");
        System.out.println(producto);

        //alquilable
        Alquilable alquilable = new Alquilable("213kj","Monitor Curva",50.5);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa = new Empresa("Dell","Av. Brasil",2000);
        Tecnologico tecnologico = new Tecnologico("2312jw","Vosrto 100","China", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor = new Monitor("fjhqw23","nose",12.5,"HD 4K");
        System.out.println(monitor);

        //cpu
        Empresa toshiba = new Empresa("TOSHIBA","Av. Brasil",1500);
        Cpu cpu = new Cpu("jh12g3","Venom","Portugal",Calendar.getInstance().getTime(), toshiba,1028);
        System.out.println(cpu);

         */

        //polimorfismo
        Producto producto = new Producto("ms150","jesus 350");

        Producto lj350 = new Impresora("lj350","canon 500",30);
        //System.out.println(lj350);
        Producto ms200 = new Monitor("ms200","Razor",25.5,"full hd");
        //System.out.println(ms200);
        Producto m500 = new DiscoDuro("m500","dell",15.0,1024);
        //System.out.println(m500);

        Impresora impresora = (Impresora)lj350;
        //System.out.println(impresora);
        Monitor monitor = (Monitor)ms200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro)m500;
        //System.out.println(m500);

        Producto[] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;
        for (int i = 0 ;i < productos.length; i++){
            System.out.println(productos[i]);
        }
    }
}
