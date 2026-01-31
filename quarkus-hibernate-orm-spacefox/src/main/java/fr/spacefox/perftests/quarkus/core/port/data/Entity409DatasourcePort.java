package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service409.model.Model409;
import java.util.Optional;

public interface Entity409DatasourcePort {
    Optional<Model409> find(Long id);
}
