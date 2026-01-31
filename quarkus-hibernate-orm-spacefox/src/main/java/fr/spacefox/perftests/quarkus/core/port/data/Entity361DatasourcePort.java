package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service361.model.Model361;
import java.util.Optional;

public interface Entity361DatasourcePort {
    Optional<Model361> find(Long id);
}
