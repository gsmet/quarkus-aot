package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service970.model.Model970;
import java.util.Optional;

public interface Entity970DatasourcePort {
    Optional<Model970> find(Long id);
}
