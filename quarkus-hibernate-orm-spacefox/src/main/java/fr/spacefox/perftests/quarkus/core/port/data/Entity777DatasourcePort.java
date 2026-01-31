package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service777.model.Model777;
import java.util.Optional;

public interface Entity777DatasourcePort {
    Optional<Model777> find(Long id);
}
