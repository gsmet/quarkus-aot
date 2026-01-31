package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service355.model.Model355;
import java.util.Optional;

public interface Entity355DatasourcePort {
    Optional<Model355> find(Long id);
}
