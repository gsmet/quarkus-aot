package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service997.model.Model997;
import java.util.Optional;

public interface Entity997DatasourcePort {
    Optional<Model997> find(Long id);
}
