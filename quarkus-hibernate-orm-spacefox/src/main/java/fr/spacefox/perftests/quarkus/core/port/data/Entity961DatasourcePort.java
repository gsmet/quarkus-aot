package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service961.model.Model961;
import java.util.Optional;

public interface Entity961DatasourcePort {
    Optional<Model961> find(Long id);
}
