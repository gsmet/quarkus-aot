package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service286.model.Model286;
import java.util.Optional;

public interface Entity286DatasourcePort {
    Optional<Model286> find(Long id);
}
