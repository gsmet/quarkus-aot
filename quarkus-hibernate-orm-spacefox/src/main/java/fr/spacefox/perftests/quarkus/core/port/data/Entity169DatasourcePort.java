package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service169.model.Model169;
import java.util.Optional;

public interface Entity169DatasourcePort {
    Optional<Model169> find(Long id);
}
