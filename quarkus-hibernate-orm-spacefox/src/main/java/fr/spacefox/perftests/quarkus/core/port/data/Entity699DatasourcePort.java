package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service699.model.Model699;
import java.util.Optional;

public interface Entity699DatasourcePort {
    Optional<Model699> find(Long id);
}
