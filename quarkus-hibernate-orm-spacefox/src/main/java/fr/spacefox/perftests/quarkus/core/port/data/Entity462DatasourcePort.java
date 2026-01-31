package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service462.model.Model462;
import java.util.Optional;

public interface Entity462DatasourcePort {
    Optional<Model462> find(Long id);
}
