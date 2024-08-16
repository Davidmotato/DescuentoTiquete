import java.util.Scanner;
public class tiquete{
    public static void main(String[] args) {
    

        final int precioNormal = 1000000;
        int Preciotiquete;
        int Edad;

        String nombre;
        System.out.println("Ingrese su Nombre");
        Scanner digito = new Scanner (System.in);
        nombre = digito.nextLine();

        System.out.println("Ingrese su edad");
        Scanner digito1 = new Scanner (System.in);
        Edad = digito1.nextInt();

        
        if (Edad < 2) {
            System.out.println("Sin tiquete");
        } else if (Edad >= 2 && Edad < 5) {
            Preciotiquete = 0;
            System.out.println("El precio de su tiquete es : $" + Preciotiquete +" Su tiquete es gratuito");
        } else if (Edad >= 5 && Edad < 11) {
            Preciotiquete = precioNormal / 2;
            System.out.println("El precio de su tiquete es : $" + Preciotiquete);
        } else if (Edad >= 11 && Edad < 15) {
            Preciotiquete = (precioNormal * 3) / 4;
            System.out.println("El precio de su tiquete es : $" + Preciotiquete);
        } else {
            Preciotiquete = precioNormal;
            System.out.println("El precio de su tiquete es : $" + Preciotiquete);
        } 
    }
}