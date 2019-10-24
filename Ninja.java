class shinobi{
  private String NoRegistrasi, nama, peringkat;

  public void setNoRegistrasI (String NoRegistrasi){
    this.NoRegistrasi = NoRegistrasi;
  }
  public String getNoRegistrasI (){
    return NoRegistrasi;
  }

  public void setNama (String nama){
    this.nama = nama;
  }
  public String getNama (){
    return nama;
  }

  public void setPeringkat (String peringkat){
    this.peringkat = peringkat;
  }
  public String getPeringkat (){
    return peringkat;
  }
}
public class Ninja{
  public static void main(String[] args){
    shinobi[] m = new shinobi[3];

    m[0] = new shinobi();
    m[0].setNoRegistrasI("0636");
    m[0].setNama("Mitsuki");
    m[0].setPeringkat("Chunin");


    m[1] = new shinobi();
    m[1].setNoRegistrasI("0637");
    m[1].setNama("Boruto Uzumaki");
    m[1].setPeringkat("Genin");

    m[2] = new shinobi();
    m[2].setNoRegistrasI("0638");
    m[2].setNama("Sarada Uchiha");
    m[2].setPeringkat("Genin");

    System.out.println("Data shinobi \n");
    for(shinobi x:m){
      System.out.println("No Registrasi : " +x.getNoRegistrasI());
      System.out.println("Nama : " +x.getNama());
      System.out.println("Peringkat : " +x.getPeringkat());
      System.out.println();
    }
  }
}
