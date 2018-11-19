package BiblioTec.API.Seed;

import BiblioTec.Domain.Usuario;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UsuarioSeed implements AppSeed {
    @Autowired
    private UsuarioService service;

    @Override
    public void loadSeed() throws IOException {
        if (service.hasData()) {
            System.out.println("Banco já possui dados");
            return;
        }
        Usuario usuario1 = new Usuario();
        usuario1.setNome("William");
        usuario1.setCpf("081.012.039-90");
        usuario1.setEmail("wdouglascosta@gmail.com");

        Usuario usuario = new Usuario();
        usuario.setNome("Douglas Reservador");
        usuario.setCpf("275.028.690-50");
        usuario.setRg("55666556");

        Usuario usuario3 = new Usuario();
        usuario3.setNome("André Luan");
        usuario3.setCpf("167.012.590-49");
        usuario3.setRg("55666556");


        service.save(usuario1);
        service.save(usuario);
        service.save(usuario3);
    }


}
