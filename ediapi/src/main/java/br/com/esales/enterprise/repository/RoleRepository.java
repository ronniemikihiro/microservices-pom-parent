package br.com.esales.enterprise.repository;

import br.com.esales.enterprise.entity.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

    Role findByDescription(String description);
}
