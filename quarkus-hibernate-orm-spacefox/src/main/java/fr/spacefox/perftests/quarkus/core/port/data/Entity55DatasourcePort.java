package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service55.model.Model55;
import java.util.Optional;

public interface Entity55DatasourcePort {
    Optional<Model55> find(Long id);
}
