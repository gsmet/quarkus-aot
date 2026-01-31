package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service872.model.Model872;
import java.util.Optional;

public interface Entity872DatasourcePort {
    Optional<Model872> find(Long id);
}
