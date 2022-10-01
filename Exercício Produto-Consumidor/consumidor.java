package produtorconsumidor;

public class consumidor extends Thread {
    filaProduto q;
        public consumidor(filaProduto q) {
            this.q = q;
            this.setName("Thread Consumidor: ");
            this.start();
        }
        public void run(){
            for(int i=0;i<8;i++){
                q.pegarProdutoFila();
            }
        }
}
