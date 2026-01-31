package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service36.model.Model36;
import java.util.Optional;

public interface Entity36DatasourcePort {
    Optional<Model36> find(Long id);
}
