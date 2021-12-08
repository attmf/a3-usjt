package Controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class PerfilController extends VerificacaoController {

    private String senhaNova;
    private Usuario usuarioLogado;

    public PerfilController(Usuario usuarioLogado, String nomeCompleto, String email, String telefone, String usuario, String senhaAntiga, String senhaNova) {
        super(nomeCompleto, email, telefone, usuario, senhaAntiga);
        this.usuarioLogado = usuarioLogado;
        this.senhaNova = senhaNova;

    }

    //Atualiza dados do user
    public Usuario updateUsuario() throws SQLException {
        
        if (usuarioLogado.exiteUsuarioeSenha() && getSenha().equals(usuarioLogado.getSenha())) {
            usuarioLogado.setEmail(getEmail());
            usuarioLogado.setNomeCompleto(getNomeCompleto());
            usuarioLogado.setTelefone(getTelefone());
            usuarioLogado.setUsuario(getUsuario());
            if(!senhaNova.equals("")){ usuarioLogado.setSenha(senhaNova);}
            usuarioLogado.update();
            JOptionPane.showMessageDialog(null, "Dados atualizados!");
            return usuarioLogado;
        } else {

            JOptionPane.showMessageDialog(null, "Erro!");
        }
        return usuarioLogado;
    }

}
