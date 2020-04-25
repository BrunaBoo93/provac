package bruna.questao5.classe;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() < 50 && nome.contains(" ")) {
            this.nome = nome;
        } else {
            throw new Exception("Você deve escrever 2 nomes de até 50 caracteres.");
        }

    }

    public void setIdade(Integer idade) throws Exception{
        if (idade < 99 && idade > 18){
            this.idade = idade;
        } else {
            throw new Exception("Insira uma idade entre 18 e  99 anos.");
        }
    }

    public void setEmail(String email) throws Exception{
        if (email.contains(".") && email.contains("@")){
            this.email = email;
        }
        else {
            throw new Exception("Insira um endereço de email valido!");
        }
    }
}
