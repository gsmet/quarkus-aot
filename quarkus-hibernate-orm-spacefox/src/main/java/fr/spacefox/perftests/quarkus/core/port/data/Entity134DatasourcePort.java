package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service134.model.Model134;
import java.util.Optional;

public interface Entity134DatasourcePort {
    Optional<Model134> find(Long id);
}
