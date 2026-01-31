package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service454.model.Model454;
import java.util.Optional;

public interface Entity454DatasourcePort {
    Optional<Model454> find(Long id);
}
