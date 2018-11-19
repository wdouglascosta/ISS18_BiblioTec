package BiblioTec.API.Seed;

import BiblioTec.Domain.Emprestimo;
import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Usuario;
import BiblioTec.Service.EmprestimoService;
import BiblioTec.Service.LivroService;
import BiblioTec.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EmprestimoSeed implements AppSeed {

    @Autowired
    private EmprestimoService emprestimoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private LivroService livroService;

    @Override
    public void loadSeed() throws IOException {
        if (emprestimoService.hasData()) {
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setNome("Silveira Emprestador");
        usuario.setCpf("027.983.169-28");
        usuarioService.save(usuario);

        Livro livro = new Livro();
        livro.setNome("O Mundo Dominado por Demônios ");
        livro.setAutor("Carl Sagan");
        livroService.save(livro);

        emprestimoService.novoEmprestimo(livro.getId(), usuario.getId());
    }
}
