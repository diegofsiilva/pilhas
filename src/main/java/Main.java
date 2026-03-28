public class Main {
    static class Pilha{
         char[] arr;
         int topo;

         Pilha(int tamanho) {
             arr=new char[tamanho];
             topo=-1;
        }
        void push(char c){
             arr[++topo]=c;

        }

        public static void main(String[] args){

        }

    }
}
