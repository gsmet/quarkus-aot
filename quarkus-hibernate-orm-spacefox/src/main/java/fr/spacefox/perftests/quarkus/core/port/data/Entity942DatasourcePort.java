package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service942.model.Model942;
import java.util.Optional;

public interface Entity942DatasourcePort {
    Optional<Model942> find(Long id);
}
