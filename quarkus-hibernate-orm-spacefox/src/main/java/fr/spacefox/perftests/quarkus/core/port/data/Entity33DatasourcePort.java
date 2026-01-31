package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service33.model.Model33;
import java.util.Optional;

public interface Entity33DatasourcePort {
    Optional<Model33> find(Long id);
}
