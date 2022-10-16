package tarefa_exceptions;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws BigStringException, BigException, SmallException {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        string = scanner.nextLine();
        try {
            try {
                if (string.length() > 15) {
                    throw new BigStringException("String tem mais de 15 caracteres");
                } else if (string.length() < 5) {
                    throw new SmallStringException("String tem menos de 5 caracteres");
                } else {
                    System.out.println("String tem tamanho adequado");
                }
            } catch (BigStringException | SmallStringException e) {
                if (e instanceof BigStringException) {
                    throw new BigException("Causa da exception: ", e);
                } else {
                    throw new SmallException("Causa da exception: ", e);
                }
            }
            try {
                if (string.matches(".*\\d.*")) {
                    throw new StringHasNumberException("String tem número");
                } else {
                    System.out.println("String não tem número");
                }
            } catch (StringHasNumberException e) {
                throw new StringException("Causa da exception", e);
            }
        } catch (Exception | StringException e) {
            System.out.println("Causa: " + e.getCause());
        }


    }
}
