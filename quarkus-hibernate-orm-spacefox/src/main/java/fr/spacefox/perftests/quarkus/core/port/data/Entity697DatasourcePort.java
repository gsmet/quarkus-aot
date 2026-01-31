package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service697.model.Model697;
import java.util.Optional;

public interface Entity697DatasourcePort {
    Optional<Model697> find(Long id);
}
