package commision.core.repositories;

import commision.core.entities.BaseImportFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Radek on 24.10.2017.
 */
@Repository
public interface ImportFileRepository extends JpaRepository<BaseImportFileEntity, Long> {
}
