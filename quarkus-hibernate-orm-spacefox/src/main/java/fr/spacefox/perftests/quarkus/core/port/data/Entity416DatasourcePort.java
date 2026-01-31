package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service416.model.Model416;
import java.util.Optional;

public interface Entity416DatasourcePort {
    Optional<Model416> find(Long id);
}
