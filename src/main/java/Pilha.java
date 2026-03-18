public class Pilha {
    int[] elemento;
    int topo;

    public Pilha(int maximo){
        elemento= new int[maximo];
        topo--;
    }
    public void push(int val){
        if(topo< elemento.length-1){
            topo++;
            elemento[topo]=val;
            System.out.println("Empilhou: " +val);
        }
        else{
            System.out.print("Deu ruim");
        }
    }
    public static void main(String[] args){
        Pilha p = new Pilha(5);
        p.push(10);
        p.push(10);
        p.push(10);
        p.push(10);

    }




}


