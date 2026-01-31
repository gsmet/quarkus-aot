package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service70.model.Model70;
import java.util.Optional;

public interface Entity70DatasourcePort {
    Optional<Model70> find(Long id);
}
