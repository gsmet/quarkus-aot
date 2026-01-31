package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service859.model.Model859;
import java.util.Optional;

public interface Entity859DatasourcePort {
    Optional<Model859> find(Long id);
}
