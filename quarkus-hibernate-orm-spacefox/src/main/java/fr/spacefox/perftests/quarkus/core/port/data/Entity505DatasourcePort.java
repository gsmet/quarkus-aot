package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service505.model.Model505;
import java.util.Optional;

public interface Entity505DatasourcePort {
    Optional<Model505> find(Long id);
}
