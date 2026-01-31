package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service808.model.Model808;
import java.util.Optional;

public interface Entity808DatasourcePort {
    Optional<Model808> find(Long id);
}
