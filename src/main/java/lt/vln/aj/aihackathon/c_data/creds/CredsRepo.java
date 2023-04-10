package lt.vln.aj.aihackathon.c_data.creds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aurelijus Jurkus
 * @since 2023-04-07
 */
@Repository
public interface CredsRepo extends JpaRepository<CredsEntity, Long> {
}
