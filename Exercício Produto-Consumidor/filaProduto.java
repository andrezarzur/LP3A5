package produtorconsumidor;
import java.util.concurrent.Semaphore;
public class filaProduto {
    static Semaphore semProduto = new Semaphore(1);
    static Semaphore semConsumidor = new Semaphore(0);

    int idProduto;

    public void colocarProdutoFila(int idProduto){
        try{
            semProduto.acquire();
            this.idProduto=idProduto;
            System.out.println(Thread.currentThread().getName() + "Colocando em fila: id do Produto (" + idProduto + ")");
            semConsumidor.release();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pegarProdutoFila() {
        try {
            semConsumidor.acquire();
            System.out.println(Thread.currentThread().getName() + "Pegando da fila: id do Produto (" + idProduto + ")");
            semProduto.release();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
