import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UTS_Pemograman_Object
{
	public static void main (String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name, clas, id;

		try
		{
			System.out.println("Masukan Data");

			System.out.print("NPM   : "); 
			id = br.readLine();

            System.out.print("Nama  : "); 
			name = br.readLine();

			System.out.print("Kelas : ");
			clas = br.readLine();

			System.out.println("===============================");
			System.out.println("======== DATA  MAHASISWA ======");
			System.out.println("===============================");
			System.out.println("NPM   : " + id);
			System.out.println("Nama  : " + name); 
			System.out.println("Kelas : " + clas); 
		}
		catch(IOException eox) 
		{
			System.out.println(eox);
		}
	}
}