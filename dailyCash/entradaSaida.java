package dailyCash;

import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.Scanner;

public class entradaSaida {

    double valorManipulado;
    String a;

    private void notificaEntrada() {
        System.out.println("Você depositou R$" + valorManipulado + " na sua conta");
    }

    private void notificaSaida() {
        System.out.println("Você retirou R$" + valorManipulado + " na sua conta");
    }

    public void manipulacao(double valorManipulado) {

        System.out.println("O valor foi retirado ou depositado?");
        new Scanner(a);

        if (a == "retirado") {
            if (valorManipulado < saldo) {
                saldo -= valorManipulado;
                notificaSaida();
                historicoDeManipulaçaoList[numDeManipulaçoes] = "-" + valorManipulado;
                numDeManipulaçoes++;
            } else {
                alertaDeConsumoExcessivo();
            }

        } else if (a == "depositado") {
            saldo -= valorManipulado;
            notificaEntrada();
            historicoDeManipulaçaoList[numDeManipulaçoes] = "+" + valorManipulado;
            numDeManipulaçoes++;
        } else {
            System.out.println("ERROR");
            System.exit(0);
        }
    }

}
