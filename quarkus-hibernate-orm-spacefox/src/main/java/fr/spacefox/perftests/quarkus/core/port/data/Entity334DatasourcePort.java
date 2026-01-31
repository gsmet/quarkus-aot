package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service334.model.Model334;
import java.util.Optional;

public interface Entity334DatasourcePort {
    Optional<Model334> find(Long id);
}
