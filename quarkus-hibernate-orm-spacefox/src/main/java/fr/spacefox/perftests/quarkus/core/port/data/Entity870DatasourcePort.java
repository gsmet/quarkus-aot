package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service870.model.Model870;
import java.util.Optional;

public interface Entity870DatasourcePort {
    Optional<Model870> find(Long id);
}
