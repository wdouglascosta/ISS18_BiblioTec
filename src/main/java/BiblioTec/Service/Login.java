package BiblioTec.Service;

import BiblioTec.API.LoginDAO;
import BiblioTec.Domain.Usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name = "LoginMB")
@ViewScoped
public class Login {
    private LoginDAO usuarioDAO = new LoginDAO();
    private Usuario usuario = new Usuario();

    public String envia() {

        usuario = usuarioDAO.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
        if (usuario == null) {
            usuario = new Usuario();
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                            "Erro no Login!"));
            return null;
        } else {
            return "/main";
        }


    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
