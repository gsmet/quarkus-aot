package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service959.model.Model959;
import java.util.Optional;

public interface Entity959DatasourcePort {
    Optional<Model959> find(Long id);
}
