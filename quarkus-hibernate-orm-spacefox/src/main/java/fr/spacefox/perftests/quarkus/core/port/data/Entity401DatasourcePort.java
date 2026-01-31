package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service401.model.Model401;
import java.util.Optional;

public interface Entity401DatasourcePort {
    Optional<Model401> find(Long id);
}
