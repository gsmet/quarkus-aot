package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service882.model.Model882;
import java.util.Optional;

public interface Entity882DatasourcePort {
    Optional<Model882> find(Long id);
}
