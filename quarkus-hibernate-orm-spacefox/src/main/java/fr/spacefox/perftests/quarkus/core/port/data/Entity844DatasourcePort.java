package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service844.model.Model844;
import java.util.Optional;

public interface Entity844DatasourcePort {
    Optional<Model844> find(Long id);
}
