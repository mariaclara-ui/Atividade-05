package Atividade_Dia_a_Dia05.entidades;
import java.util.ArrayList;
import Atividade_Dia_a_Dia05.entidades.produto;
public class cardapio {
    private ArrayList<produto> itens;

    public cardapio(){
        itens=new ArrayList<>();
        //posso fazer isso repetir//
        itens.add(new produto("Hambúrguer",25.00));
        itens.add(new produto("Pizza", 45.00));
        itens.add(new produto("Batata Frita", 15.00));
        itens.add(new produto("Refrigerante", 8.00));
    }
    public ArrayList<produto> getItens() {
        return itens;
    }
}

