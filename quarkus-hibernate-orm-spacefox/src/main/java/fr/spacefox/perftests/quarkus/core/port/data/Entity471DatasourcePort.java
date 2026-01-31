package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service471.model.Model471;
import java.util.Optional;

public interface Entity471DatasourcePort {
    Optional<Model471> find(Long id);
}
