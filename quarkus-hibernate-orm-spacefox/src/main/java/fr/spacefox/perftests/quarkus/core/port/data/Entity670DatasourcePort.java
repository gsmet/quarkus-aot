package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service670.model.Model670;
import java.util.Optional;

public interface Entity670DatasourcePort {
    Optional<Model670> find(Long id);
}
