package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service621.model.Model621;
import java.util.Optional;

public interface Entity621DatasourcePort {
    Optional<Model621> find(Long id);
}
