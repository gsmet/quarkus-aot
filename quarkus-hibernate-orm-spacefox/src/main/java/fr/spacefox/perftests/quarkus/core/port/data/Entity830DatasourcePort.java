package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service830.model.Model830;
import java.util.Optional;

public interface Entity830DatasourcePort {
    Optional<Model830> find(Long id);
}
