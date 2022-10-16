package options;

import java.util.Optional;

public class mainOptions {
    public static void main(String args[]) {
        final Integer numero = null;
        optionOf(numero);
        optionOfNullable(numero);
        optionFilter(numero);
        optionOrElse(numero);
        optionOrElseGet(numero);
        optionOrElseThrow(numero);
    }

    private static void optionOf(Integer valor) {
        try {
            Optional<Object> op = Optional.of(valor);
            System.out.println(op);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void optionOfNullable(Integer valor) {
        try {
            Optional<Object> op = Optional.ofNullable(valor);
            System.out.println(op);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void optionFilter(Integer valor) {
        try {
            Optional<Object> op = Optional.of(valor);
            System.out.println(op.filter(o -> o == "test"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void optionOrElse(Object valor) {
        try {
            Optional<Object> op = Optional.ofNullable(valor);
            System.out.println(op.orElse("O valor é null"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void optionOrElseGet(Object valor) {
        try {
            Optional<Object> op = Optional.ofNullable(valor);
            System.out.println(op.orElseGet(() -> {
                String check = "entrou";
                return check;
            }));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void optionOrElseThrow(Object valor) {
        try {
            Optional<Object> op = Optional.ofNullable(valor);
            System.out.println(op.orElseThrow(IllegalArgumentException::new));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
