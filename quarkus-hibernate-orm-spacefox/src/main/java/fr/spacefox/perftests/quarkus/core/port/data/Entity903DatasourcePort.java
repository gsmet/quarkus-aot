package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service903.model.Model903;
import java.util.Optional;

public interface Entity903DatasourcePort {
    Optional<Model903> find(Long id);
}
