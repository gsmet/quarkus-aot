package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service718.model.Model718;
import java.util.Optional;

public interface Entity718DatasourcePort {
    Optional<Model718> find(Long id);
}
