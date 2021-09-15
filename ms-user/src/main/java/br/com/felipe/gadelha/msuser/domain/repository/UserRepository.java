package br.com.felipe.gadelha.msuser.domain.repository;

import br.com.felipe.gadelha.msuser.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
