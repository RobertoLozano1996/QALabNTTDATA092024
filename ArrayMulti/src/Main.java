public class Main {
    public static void main(String[] args) {


        int listaArray[][] = { {12,3,3},  {19,2,4} };

        //System.out.println(listaArray[1][1]);

        for(int i=0;i<listaArray.length;i++ ){
            //System.out.println("Hola: " + i);
            for(int j=0;j< listaArray[i].length;j++){
                System.out.println(listaArray[i][j]);

            }
            System.out.println("");
        }
    }
}