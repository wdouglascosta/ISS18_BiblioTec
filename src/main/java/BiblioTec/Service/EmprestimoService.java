package BiblioTec.Service;

import BiblioTec.Domain.Emprestimo;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Reserva;
import BiblioTec.Domain.Usuario;
import BiblioTec.Repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService extends ServiceBase<Emprestimo, Long, EmprestimoRepository> {
    public EmprestimoService(EmprestimoRepository repository) {
        super(repository);
    }

    @Autowired
    private ReservaService reservaService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private LivroService livroService;

    @Override
    public void delete(Long aLong) {
        repository.delete(aLong);
    }

    public List<Emprestimo> getEmprestimosByUsuario(Usuario usuario){
        return repository.findByUsuario(usuario);
    }

    public Emprestimo novoEmprestimo(Long livroId, Long usuarioId) {

        Livro livro = livroService.getById(livroId);
        Usuario usuario = usuarioService.getById(usuarioId);

        if (!livro.getStatus().equals(ItemStatus.DISPONIVEL) || !usuario.getAtivo()) {
            return null;
        }

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        livro.setStatus(ItemStatus.EMPRESTADO);

        livroService.update(livro.getId(), livro);

        emprestimo.setUsuario(usuario);
        emprestimo = save(emprestimo);
        usuarioService.save(usuario);
        return emprestimo;
    }

    public Emprestimo novoEmprestimoFromReserva(Reserva reserva) {
        reservaService.delete(reserva.getId());
        return novoEmprestimo(reserva.getLivro().getId(), reserva.getUsuario().getId());
    }
}
