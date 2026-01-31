package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service925.model.Model925;
import java.util.Optional;

public interface Entity925DatasourcePort {
    Optional<Model925> find(Long id);
}
