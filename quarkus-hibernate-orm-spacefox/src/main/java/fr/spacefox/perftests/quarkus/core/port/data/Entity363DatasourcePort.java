package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service363.model.Model363;
import java.util.Optional;

public interface Entity363DatasourcePort {
    Optional<Model363> find(Long id);
}
