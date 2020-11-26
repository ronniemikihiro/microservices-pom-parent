package br.com.esales.enterprise.repository;

import br.com.esales.enterprise.entity.UserSystem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSystemRepository extends PagingAndSortingRepository<UserSystem, Long> {

    UserSystem findByEmail(String email);

}
