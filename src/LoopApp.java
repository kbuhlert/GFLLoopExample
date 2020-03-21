public class LoopApp {
    public static void main(String[] args) {
        double erg = 0;
        for (int i = 2; i<=10; i++){
            double bruch = 1.0/i;
            erg = erg + bruch;
        }
        System.out.printf("Das Ergebnis ist %.3f \n", erg);

        System.out.println(summeVonDreien());
        System.out.println(summeMatrNr());
    }

    public static int summeVonDreien (){
        int summe=0;
        for (int i = 3; i<=9000; i=i+3){
            summe = summe + i;
        } return summe;
    }

    public static int summeMatrNr (){
        String matrStr = "4177654";
        int summe = 0;
        for(int index =0; index<matrStr.length();index++){
            char matrChar = matrStr.charAt(index);
            String s = Character.toString(matrChar);
            int matrZahl = Integer.parseInt(s);
            summe += matrZahl;
        }
        return summe;
    }
}
