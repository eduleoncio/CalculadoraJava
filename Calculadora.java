public class CalculadoraPipeline {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java CalculadoraPipeline <num1> <operador> <num2>");
            System.out.println("Operadores permitidos: +, -, *, /");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        char operador = args[1].charAt(0);
        double num2 = Double.parseDouble(args[2]);
        double resultado = 0;
        boolean valido = true;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido: " + operador);
                valido = false;
        }

        if (valido) {
            System.out.println(resultado);
        }
    }
}