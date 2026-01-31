package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service139.model.Model139;
import java.util.Optional;

public interface Entity139DatasourcePort {
    Optional<Model139> find(Long id);
}
