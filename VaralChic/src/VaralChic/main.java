package VaralChic;

import VaralChic.views.TelaLogin;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chamar a tela login para iniciar o programa
        TelaLogin telaLogin = new TelaLogin();
        
        //chamar a tela para torna-la visivel
        telaLogin.setVisible(true);
    }

}
