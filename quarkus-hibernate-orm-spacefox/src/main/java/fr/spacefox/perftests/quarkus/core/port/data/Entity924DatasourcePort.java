package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service924.model.Model924;
import java.util.Optional;

public interface Entity924DatasourcePort {
    Optional<Model924> find(Long id);
}
