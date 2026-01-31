package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service349.model.Model349;
import java.util.Optional;

public interface Entity349DatasourcePort {
    Optional<Model349> find(Long id);
}
