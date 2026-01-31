package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service573.model.Model573;
import java.util.Optional;

public interface Entity573DatasourcePort {
    Optional<Model573> find(Long id);
}
