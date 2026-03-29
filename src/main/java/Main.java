public class Main{
    static class Pilha{
        int topo;
        char[] arr;

        Pilha(int tamanho){
            topo=-1;
            arr=new char[tamanho];
        }
        void push(char c){
            arr[++topo]=c;
        }
        char pop(){
             return arr[topo--];
        }
        boolean isEmpty(){
            return topo ==-1;
        }
    }
    public static String inverter(String s) {
        Pilha p = new Pilha(s.length());

        for (int i = 0; i < s.length(); i++) {
            p.push(s.charAt(i));
        }
        String res = "";
        while (!p.isEmpty()) {
            res += p.pop();

        }
        return res;
    }
    public static void main(String[]args){
        String entrada="abc";
        System.out.println(inverter(entrada));
    }
}