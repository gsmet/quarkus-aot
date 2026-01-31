package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service145.model.Model145;
import java.util.Optional;

public interface Entity145DatasourcePort {
    Optional<Model145> find(Long id);
}
