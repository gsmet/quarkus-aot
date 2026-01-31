package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service466.model.Model466;
import java.util.Optional;

public interface Entity466DatasourcePort {
    Optional<Model466> find(Long id);
}
