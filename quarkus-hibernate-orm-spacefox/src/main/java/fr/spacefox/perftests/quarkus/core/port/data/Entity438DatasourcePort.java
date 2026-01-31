package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service438.model.Model438;
import java.util.Optional;

public interface Entity438DatasourcePort {
    Optional<Model438> find(Long id);
}
