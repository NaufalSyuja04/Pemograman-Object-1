public class ArrayDimensiDua
{
    public static void main(String [] args)
    {
        int [][] piksel = new int[2][3];
        // Elemen 512 x 128 dari integer array
        int[][] twoD = new int[512][128];
        // karakter array 8 x 16 x 24 
        char[][][] threeD = new char[8][16][24];
        // String array 4 baris x 2 kolom 
        String[][] dogs = {{ "terry", "brown" },
            { "Kristin", "white" }, {
            "toby", "gray"},
            { "fido", "black"}
        };
        // mengisi elemen tertentu
        piksel[0][0] = 70;
        piksel[0][1] = 18;
        piksel[0][2] = 45;
        piksel[1][0] = 75;
        piksel[1][1] = 66;
        piksel[1][2] = 89;
        //menampilkan elemen array
        int i,j;
        for(i=0;i<2;i++){
            for (j=0; j<3;j++)
            System.out.print(piksel[i][j] +" ");
            System.out.println("");
        }
        for(i=0;i<2;i++){
            for (j=0; j<3;j++)
            System.out.print( dogs[0][0] );
            System.out.println("");
        }
    }
}