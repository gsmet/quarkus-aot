package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service593.model.Model593;
import java.util.Optional;

public interface Entity593DatasourcePort {
    Optional<Model593> find(Long id);
}
