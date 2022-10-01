package produtorconsumidor;

public class produtor extends Thread{
    filaProduto q;
        public produtor(filaProduto q) {
            this.q = q;
            this.setName("Thread Produtor: ");
            this.start();
        }
        public void run(){
            for(int i=0; i<8;i++){
                q.colocarProdutoFila(i);
            }
        }
}
