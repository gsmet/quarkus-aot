package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service895.model.Model895;
import java.util.Optional;

public interface Entity895DatasourcePort {
    Optional<Model895> find(Long id);
}
