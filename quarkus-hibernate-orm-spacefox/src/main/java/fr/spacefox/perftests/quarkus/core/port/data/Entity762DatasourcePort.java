package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service762.model.Model762;
import java.util.Optional;

public interface Entity762DatasourcePort {
    Optional<Model762> find(Long id);
}
