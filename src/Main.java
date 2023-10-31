public class Main {
    // Atribut
    private String nama="bardata aji";
    private String alamat="kalang";
    private int umur= 22;



    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat saya = "+alamat);
    }

    public static void main(String[] args) {
        Main objek = new Main();

        // Memanggil metode tampilkanInfo
        objek.tampilkanInfo();
    }
}
