package BiblioTec.Service;

import BiblioTec.Domain.Usuario;
import BiblioTec.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class UsuarioService extends PessoaService<Usuario, UsuarioRepository> {

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        super(repository);
    }


    public boolean hasData(){
        return repository.count() > 0;
    }
    
    
    
    public void removerInadimplencia(Long id){
        Usuario u = repository.findOne(id);
        u.setDetalhesInadimplencia("Nenhuma inadimplencia");
    }

    public String testService(String valor){
        return valor + " - Ok!";
    }
}
