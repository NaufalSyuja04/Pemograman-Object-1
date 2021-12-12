class Alamat
{
    String AlmTinggal;
    String KabKota;
    String KodePos;
    String Provinsi;
    Alamat(String alm, String kab, String kode, String prov)
    {
        this.AlmTinggal=alm;
        this.KabKota = kab;
        this.KodePos = kode;
        this.Provinsi = prov;
    }
}
class Penduduk
{
    String NIK;
    String Nama;
    String Pekerjaan;
    Alamat almt;
    Penduduk(String NK, String Nm, String pk, Alamat al){
        this.NIK=NK;
        this.Nama=Nm;
        this.almt=al;
    }
}
public class Agregasi
{
    public static void main(String args[])
    {
        Alamat pkp = new Alamat("Jln. Sukijah Sukiman","Kencana Majalaya","40387","Kabupaten Bandung");
        Penduduk ani = new Penduduk("0623232","Asep Kiyomasa","Karyawan Swasta",pkp);

        System.out.println(" DATA PENDUDUK ");
        System.out.println("---------------");
        System.out.println(" NIK      : "+ani.NIK);
        System.out.println(" Nama     : "+ani.Nama);
        System.out.println(" Alamat   : "+ani.almt.AlmTinggal);
        System.out.println(" Kota     : "+ani.almt.KabKota);
        System.out.println(" Provinsi : "+ani.almt.Provinsi);
    }
}