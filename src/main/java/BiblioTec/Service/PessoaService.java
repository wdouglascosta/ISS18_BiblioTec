package BiblioTec.Service;

import BiblioTec.Domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends ServiceBase<Pessoa, Long> {

    @Autowired
    public PessoaService(JpaRepository<Pessoa, Long> repository) {
        super(repository);
    }




}
