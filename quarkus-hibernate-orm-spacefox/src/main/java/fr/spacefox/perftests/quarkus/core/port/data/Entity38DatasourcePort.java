package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service38.model.Model38;
import java.util.Optional;

public interface Entity38DatasourcePort {
    Optional<Model38> find(Long id);
}
