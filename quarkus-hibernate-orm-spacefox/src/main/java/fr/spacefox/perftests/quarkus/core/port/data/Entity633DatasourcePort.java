package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service633.model.Model633;
import java.util.Optional;

public interface Entity633DatasourcePort {
    Optional<Model633> find(Long id);
}
