package Ex001;

public class calculoOperadores {
    public static void main(String[] args) {
        float salario = 1250.00F;
        float aumento = salario * 30 / 100 + salario;

        System.out.println("Seu novo salario será de " + aumento);
    }
}
