package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service511.model.Model511;
import java.util.Optional;

public interface Entity511DatasourcePort {
    Optional<Model511> find(Long id);
}
