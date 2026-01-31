package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service944.model.Model944;
import java.util.Optional;

public interface Entity944DatasourcePort {
    Optional<Model944> find(Long id);
}
