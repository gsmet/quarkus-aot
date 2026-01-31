package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service272.model.Model272;
import java.util.Optional;

public interface Entity272DatasourcePort {
    Optional<Model272> find(Long id);
}
