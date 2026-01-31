package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service526.model.Model526;
import java.util.Optional;

public interface Entity526DatasourcePort {
    Optional<Model526> find(Long id);
}
