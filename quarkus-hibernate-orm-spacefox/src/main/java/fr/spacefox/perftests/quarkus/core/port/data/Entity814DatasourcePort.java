package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service814.model.Model814;
import java.util.Optional;

public interface Entity814DatasourcePort {
    Optional<Model814> find(Long id);
}
