package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service447.model.Model447;
import java.util.Optional;

public interface Entity447DatasourcePort {
    Optional<Model447> find(Long id);
}
