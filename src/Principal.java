public class Principal {
    public static void main(String[] args) {

        System.out.print("Arreglo: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" - ");
        }
        System.out.println();//para que haga una separacion

        int[] arrayNums = new int[args.length];
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = Integer.parseInt(args[i]);
        }//fin for

        System.out.print("Suma Prefija: "+arrayNums[0]+" - ");

        int acumulador = 1;
        for (int i = 1; i < arrayNums.length; i++) {
            acumulador += arrayNums[i];
            System.out.print(acumulador+" - ");
        }

    }//fin main
}//fin clase
