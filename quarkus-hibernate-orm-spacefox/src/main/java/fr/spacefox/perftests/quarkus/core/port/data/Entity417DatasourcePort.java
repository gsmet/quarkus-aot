package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service417.model.Model417;
import java.util.Optional;

public interface Entity417DatasourcePort {
    Optional<Model417> find(Long id);
}
