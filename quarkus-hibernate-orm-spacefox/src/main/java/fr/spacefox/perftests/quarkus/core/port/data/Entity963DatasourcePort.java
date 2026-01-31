package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service963.model.Model963;
import java.util.Optional;

public interface Entity963DatasourcePort {
    Optional<Model963> find(Long id);
}
