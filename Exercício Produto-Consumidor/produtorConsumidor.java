package produtorconsumidor;

public class produtorConsumidor {
    public static void main(String[] args) {
        filaProduto fp = new filaProduto();
        produtor p = new produtor(fp);
        consumidor c = new consumidor(fp);
    }
}
