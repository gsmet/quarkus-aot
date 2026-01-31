package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service141.model.Model141;
import java.util.Optional;

public interface Entity141DatasourcePort {
    Optional<Model141> find(Long id);
}
