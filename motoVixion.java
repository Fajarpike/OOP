public class motoVixion extends motor {

    motoVixion(String name, String clasifikasi, int price){
        super(name, clasifikasi, price);
    }


    void belok(String bulakbelok){
        System.out.println("nama motor ini " + this.name + " termasuk kedalam clasifikasi" + 
        this.clasifikasi + " motor ini harganya " + this.price + " mampu melakukan " + bulakbelok);
    }
    
}
