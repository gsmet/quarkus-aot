package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service815.model.Model815;
import java.util.Optional;

public interface Entity815DatasourcePort {
    Optional<Model815> find(Long id);
}
