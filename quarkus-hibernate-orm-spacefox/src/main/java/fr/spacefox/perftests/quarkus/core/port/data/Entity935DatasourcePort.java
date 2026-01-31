package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service935.model.Model935;
import java.util.Optional;

public interface Entity935DatasourcePort {
    Optional<Model935> find(Long id);
}
