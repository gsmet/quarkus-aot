package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service274.model.Model274;
import java.util.Optional;

public interface Entity274DatasourcePort {
    Optional<Model274> find(Long id);
}
