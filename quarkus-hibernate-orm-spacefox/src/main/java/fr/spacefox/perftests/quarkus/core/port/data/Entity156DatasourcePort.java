package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service156.model.Model156;
import java.util.Optional;

public interface Entity156DatasourcePort {
    Optional<Model156> find(Long id);
}
