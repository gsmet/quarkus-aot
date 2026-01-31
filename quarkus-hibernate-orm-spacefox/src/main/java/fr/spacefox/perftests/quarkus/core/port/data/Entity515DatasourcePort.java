package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service515.model.Model515;
import java.util.Optional;

public interface Entity515DatasourcePort {
    Optional<Model515> find(Long id);
}
