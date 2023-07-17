package model;

import java.util.ArrayList;
import java.util.List;

public class Autenticador {
    private List<String> credenciais;

    public Autenticador(){
        credenciais = new ArrayList<>();
    }

    public void adicionarCredencial(String credencial){
        credenciais.add(credencial);
    }

    public boolean autenticar(Autenticavel autenticavel){
        String credencial = autenticavel.obterCredencial();

        return estaAutenticado(credencial);
    }

    private boolean estaAutenticado(String credencial) {
        for (String chave : credenciais) {
            if (chave.equals(credencial)) {
                return true;
            }
        }
        return false;
    }
    
    public List<String> getCredenciais() {
        return credenciais;
    }
}
