package BiblioTec.Service;

import BiblioTec.Domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends ServiceBase<Person, Long> {

    @Autowired
    public PersonService(JpaRepository<Person, Long> repository) {
        super(repository);
    }




}
