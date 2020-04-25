package bruna.questao5.programa;

import bruna.questao5.classe.Pessoa;

public class Main {
    public static void main(String[] args){
        try{
            Pessoa pessoa = new Pessoa();
            pessoa.setEmail("brunaoriani@gmail.com");
            pessoa.setIdade(30);
            pessoa.setNome("Joaquim Barbosa");
            System.out.println(String.format("Seu nome: %s \n" +  "Sua idade: %d \n" + "Seu email: %s\n",
                    pessoa.getNome(), pessoa.getIdade(), pessoa.getEmail()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
