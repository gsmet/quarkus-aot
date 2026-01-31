package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service813.model.Model813;
import java.util.Optional;

public interface Entity813DatasourcePort {
    Optional<Model813> find(Long id);
}
