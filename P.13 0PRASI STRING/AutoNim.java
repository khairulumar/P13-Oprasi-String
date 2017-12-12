public class AutoNim {

    public static void main(String[] args){
        // NIM : Tahun Masuk + Kode Prodi + Nomor Urut Registrasi
        String ta = "2015";
        String kd_prodi = "153";
        String no_reg = "0001";     // di jeneret memakai perulangan
        String nim ;

        nim = ta.substring(2, 4)+ kd_prodi + no_reg; // angka 2 menunjukan indexnya dan 4 Menunjukan sampai karakter ke berapa berhenti
        System.out.println("NIM : "+nim);
    }
}
