package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service475.model.Model475;
import java.util.Optional;

public interface Entity475DatasourcePort {
    Optional<Model475> find(Long id);
}
