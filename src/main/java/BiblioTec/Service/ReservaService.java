package BiblioTec.Service;

import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Item;
import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Reserva;
import BiblioTec.Domain.Usuario;
import BiblioTec.Repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService extends ServiceBase<Reserva, Long, ReservaRepository> {
    public ReservaService(ReservaRepository repository) {
        super(repository);
    }

    @Autowired
    private LivroService livroService;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void delete(Long aLong) {
        repository.delete(aLong);
    }

    public Reserva novaReserva(Livro livro, Usuario usuario) {
        if (livro.getStatus().equals(ItemStatus.DISPONIVEL) || !usuario.getAtivo()){
            return null;

        }
        Reserva reserva = new Reserva();
        reserva.setUsuario(usuario);
        reserva.setLivro(livro);
        livro.setStatus(ItemStatus.RESERVADO);

        livroService.save(livro);
        return save(reserva);
    }

    public Reserva getByLivro(Livro livro){
        return repository.findByLivro(livro);
    }




}
