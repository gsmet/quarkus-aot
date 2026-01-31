package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service589.model.Model589;
import java.util.Optional;

public interface Entity589DatasourcePort {
    Optional<Model589> find(Long id);
}
