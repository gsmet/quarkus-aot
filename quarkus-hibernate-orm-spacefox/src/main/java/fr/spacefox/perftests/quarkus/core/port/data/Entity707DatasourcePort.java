package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service707.model.Model707;
import java.util.Optional;

public interface Entity707DatasourcePort {
    Optional<Model707> find(Long id);
}
