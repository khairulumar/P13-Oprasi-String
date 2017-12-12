public class Demo1{

    public static void main(String[] args){
        String S = "Pemrograman java";
        String HurufKapital=S.toUpperCase();
        String HurufKecil=S.toLowerCase();

        int IndexAwal = 12;
        int IndexAkhir = 16;
        char[] Karakter=new char[IndexAkhir-IndexAwal];
        S.getChars(IndexAwal, IndexAkhir, Karakter, 0);

        byte[] temp = new byte[S.length()];
        temp = S.getBytes();

        String Trim=S.trim();
        String Sub=S.substring(5, 9);
        String Replace1=S.replace("pemprograman","program");
        String Replace2="java".replace('v', 'w');

        System.out.println("penggunaan toUpperCase()\t : "+HurufKapital);
        System.out.println("penggunaan method toLowerCase()\t : "+HurufKecil);
        System.out.println("penggunaan method charAt()\t : "+S.charAt(0));
        System.out.println("penggunaan method getChars()\t : "+Karakter[0]);
        System.out.println("penggunaan method getBytes()\t : "+temp[0]);
        System.out.println("penggunaan method trim()\t : "+Trim);
        System.out.println("penggunaan method substring()\t : "+Sub);
        System.out.println("penggunaan method replace()\t : "+Replace1+""+Replace2);
    
    }
    
}

// integer tipe data sama dengan class dan lebih kompleks
// int tipe data tidak murni