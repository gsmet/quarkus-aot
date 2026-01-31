package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service587.model.Model587;
import java.util.Optional;

public interface Entity587DatasourcePort {
    Optional<Model587> find(Long id);
}
