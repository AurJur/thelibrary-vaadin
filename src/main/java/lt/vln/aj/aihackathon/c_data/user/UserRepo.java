package lt.vln.aj.aihackathon.c_data.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-06
 */
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByFullName(String fullName);

    UserEntity findByEmail(String email);

}
