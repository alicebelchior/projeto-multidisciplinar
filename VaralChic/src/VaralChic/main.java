package VaralChic;

import VaralChic.views.frmTelaLogin;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chamar a tela login para iniciar o programa
        frmTelaLogin telaLogin = new frmTelaLogin();
        
        //chamar a tela para torna-la visivel
        telaLogin.setVisible(true);
    }

}
