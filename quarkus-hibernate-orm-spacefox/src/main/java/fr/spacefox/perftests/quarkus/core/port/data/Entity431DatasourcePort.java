package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service431.model.Model431;
import java.util.Optional;

public interface Entity431DatasourcePort {
    Optional<Model431> find(Long id);
}
