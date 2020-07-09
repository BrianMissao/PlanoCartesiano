import java.util.Scanner;

public class DizAQuemUmPontoPertence {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double coordenadaX = obterCoordenada("Digite a coordenada X:");
        double coordenadaY = obterCoordenada("Digite a coordenada Y:");
        calcularEImprimirAQuemPertenceOPonto(coordenadaX, coordenadaY);
    }

    private static void calcularEImprimirAQuemPertenceOPonto(double coordenadaX, double coordenadaY) {
        String aQuemPertence;
        if (coordenadaX > 0 && coordenadaY > 0) {
            aQuemPertence = "Quadrante 1";
        } else if (coordenadaX <0 && coordenadaY > 0) {
            aQuemPertence = "Quadrante 2";
        } else if (coordenadaX < 0 && coordenadaY < 0) {
            aQuemPertence = "Quadrante 3";
        } else if (coordenadaX > 0 && coordenadaY < 0) {
            aQuemPertence = "Quadrante 4";
        } else if (coordenadaX == 0 && coordenadaY > 0) {
            aQuemPertence = "Eixo Y";
        } else if (coordenadaX > 0 && coordenadaY == 0) {
            aQuemPertence = "Eixo X";
        } else {
            aQuemPertence = "Origem";
        }
        System.out.println(aQuemPertence);
    }

    private static double obterCoordenada(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextDouble();
    }
}
