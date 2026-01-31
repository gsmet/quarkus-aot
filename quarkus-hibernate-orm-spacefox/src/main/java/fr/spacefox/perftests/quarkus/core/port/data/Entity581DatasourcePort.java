package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service581.model.Model581;
import java.util.Optional;

public interface Entity581DatasourcePort {
    Optional<Model581> find(Long id);
}
