package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service88.model.Model88;
import java.util.Optional;

public interface Entity88DatasourcePort {
    Optional<Model88> find(Long id);
}
