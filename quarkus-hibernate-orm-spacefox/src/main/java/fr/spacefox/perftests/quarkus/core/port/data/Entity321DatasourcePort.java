package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service321.model.Model321;
import java.util.Optional;

public interface Entity321DatasourcePort {
    Optional<Model321> find(Long id);
}
