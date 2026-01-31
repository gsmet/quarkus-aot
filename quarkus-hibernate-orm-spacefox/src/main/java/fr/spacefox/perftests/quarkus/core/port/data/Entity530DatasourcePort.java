package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service530.model.Model530;
import java.util.Optional;

public interface Entity530DatasourcePort {
    Optional<Model530> find(Long id);
}
