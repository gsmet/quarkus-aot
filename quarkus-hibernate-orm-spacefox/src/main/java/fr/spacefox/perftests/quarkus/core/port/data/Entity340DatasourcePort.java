package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service340.model.Model340;
import java.util.Optional;

public interface Entity340DatasourcePort {
    Optional<Model340> find(Long id);
}
