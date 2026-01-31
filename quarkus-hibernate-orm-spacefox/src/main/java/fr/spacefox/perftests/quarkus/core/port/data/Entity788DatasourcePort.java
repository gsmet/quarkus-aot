package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service788.model.Model788;
import java.util.Optional;

public interface Entity788DatasourcePort {
    Optional<Model788> find(Long id);
}
