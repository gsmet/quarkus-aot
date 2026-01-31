package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service635.model.Model635;
import java.util.Optional;

public interface Entity635DatasourcePort {
    Optional<Model635> find(Long id);
}
