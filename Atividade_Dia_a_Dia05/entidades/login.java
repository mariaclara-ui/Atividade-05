package Atividade_Dia_a_Dia05.entidades;

public class login {
    private String email;
    private String senha;

    public login(String email,String senha) {
        this.email = email;
        this.senha=senha;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }

}
