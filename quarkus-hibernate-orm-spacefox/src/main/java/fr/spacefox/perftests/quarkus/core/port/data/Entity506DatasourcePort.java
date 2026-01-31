package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service506.model.Model506;
import java.util.Optional;

public interface Entity506DatasourcePort {
    Optional<Model506> find(Long id);
}
