package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service381.model.Model381;
import java.util.Optional;

public interface Entity381DatasourcePort {
    Optional<Model381> find(Long id);
}
