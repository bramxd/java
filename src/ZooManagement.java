import java.util.Scanner;
public class ZooManagement {

    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " a " + nbrCages + " cages");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de cages : ");

        nbrCages = scanner.nextInt();
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.next();
        System.out.println("Changements effectués : " + zooName + " comporte " + nbrCages + " cages");
    }
}
