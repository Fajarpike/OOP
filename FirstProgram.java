class FirstProgram {

    public static void tampilkanNama() {
        String[] Nama = {"Fajar", "Tita", "Aisyah"};
        for(String i : Nama) {
            System.out.println(i);
        }   }

    
    public static void perbandingan(){
       int angka1 = 4;
       int angka2 = 3;
       
       if(angka1 == angka2){
        System.out.println(true);
       }else{
        System.out.println(false);
       }

    }

    public static void main(String[] args) {
        System.out.println("Program pertama");
        tampilkanNama();
        perbandingan();
}
}