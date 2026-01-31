package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service858.model.Model858;
import java.util.Optional;

public interface Entity858DatasourcePort {
    Optional<Model858> find(Long id);
}
