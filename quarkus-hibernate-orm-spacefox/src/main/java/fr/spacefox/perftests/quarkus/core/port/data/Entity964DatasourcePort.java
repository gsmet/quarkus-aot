package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service964.model.Model964;
import java.util.Optional;

public interface Entity964DatasourcePort {
    Optional<Model964> find(Long id);
}
