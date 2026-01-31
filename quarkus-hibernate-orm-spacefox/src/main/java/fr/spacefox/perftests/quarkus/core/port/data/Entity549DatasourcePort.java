package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service549.model.Model549;
import java.util.Optional;

public interface Entity549DatasourcePort {
    Optional<Model549> find(Long id);
}
