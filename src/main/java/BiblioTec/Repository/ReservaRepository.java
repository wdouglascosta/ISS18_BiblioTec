package BiblioTec.Repository;

import BiblioTec.Domain.Livro;
import BiblioTec.Domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Reserva findByLivro(Livro livro);
}
