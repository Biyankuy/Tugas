package PemrogramanBerbasisDesktop.Tugas3;

abstract class MenuItem {
    
    private String nama;
    private double harga;
    private String kategori;

    public MenuItem(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    public abstract void tampilMenu();

    @Override
    public String toString() {
        return nama + "," + harga + "," + kategori;
    }
}