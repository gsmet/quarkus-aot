package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service229.model.Model229;
import java.util.Optional;

public interface Entity229DatasourcePort {
    Optional<Model229> find(Long id);
}
