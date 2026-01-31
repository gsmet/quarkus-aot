package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service791.model.Model791;
import java.util.Optional;

public interface Entity791DatasourcePort {
    Optional<Model791> find(Long id);
}
