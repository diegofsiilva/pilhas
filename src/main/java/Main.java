public class Main {
    static class Fila{
        int[] arr;
        int inicio;
        int fim;

        Fila(int tamanho){
            arr=new int[tamanho];
            inicio=0;
            fim=0;
        }
        void enqueue(int x){
            arr[fim]=x;
            x++;
        }
        int dequeue(){
            int valor=arr[inicio];
            inicio++;
            return valor;
        }
        boolean isEmpty(){
            return inicio==fim;
        }
    }



    public static void main(String[] args){

    }
}