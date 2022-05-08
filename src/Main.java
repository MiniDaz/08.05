import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ot;
        int Do;
        int popitki;
        Scanner scanner= new Scanner(System.in);
        System.out.println("vibirete diapozon ot");
        ot= scanner.nextInt();
        System.out.println("vibirete diapozon do");
        Do= scanner.nextInt();
        System.out.println("chislo popitok");
        popitki= scanner.nextInt();
        int x = (int) (Math.random()*(Do-ot)+ot);
        boolean a=true;
        while (a){
            popitki--;
            System.out.println("угадай число,ощибиться можно "+popitki+" раз");


            int y= scanner.nextInt();
            if(x>y){
                System.out.println(" загаданное число больше ");
            }else if (x<y){
                System.out.println(" загаданное число меньше ");
            }else {
                System.out.println( " vi ugodali");
                a=false;
            }
            if(popitki==0){
                System.out.println(" konchilis popitki,vi proigrali");
                a=false;
            }

        }
        }
    }

