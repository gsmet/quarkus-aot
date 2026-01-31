package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service111.model.Model111;
import java.util.Optional;

public interface Entity111DatasourcePort {
    Optional<Model111> find(Long id);
}
