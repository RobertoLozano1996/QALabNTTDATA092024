public class Main {
    public static void main(String[] args) {

        for(int i=100; i<=130; i=i+2){
            //System.out.println("Hola: " + i);
        }

        for(int i=100; i>=0; i--){
            //System.out.println("Hola: " + i);
        }

        int n = 3;
        for(int i=1; i<=10-n; i++){
           // System.out.println("Hola: " + i);
        }

        for(int i=0; i<=5; i++){
            System.out.println("Hola: " + i);
            for(int j=i; j<=3+i; j++){
                System.out.println("\t: valor " + j);
            }
        }
    }
}
/*

necesitas usar 2 bucles ...
Ejercicios 4 minutos, 4 minutos, 10minutos

n = 4;

#
##
###
####

####
###
##
#


# ####
## ###
### ##
#### #


 */