package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service257.model.Model257;
import java.util.Optional;

public interface Entity257DatasourcePort {
    Optional<Model257> find(Long id);
}
