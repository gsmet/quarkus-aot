package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service953.model.Model953;
import java.util.Optional;

public interface Entity953DatasourcePort {
    Optional<Model953> find(Long id);
}
