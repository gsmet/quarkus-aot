package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service460.model.Model460;
import java.util.Optional;

public interface Entity460DatasourcePort {
    Optional<Model460> find(Long id);
}
