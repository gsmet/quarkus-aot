package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service658.model.Model658;
import java.util.Optional;

public interface Entity658DatasourcePort {
    Optional<Model658> find(Long id);
}
