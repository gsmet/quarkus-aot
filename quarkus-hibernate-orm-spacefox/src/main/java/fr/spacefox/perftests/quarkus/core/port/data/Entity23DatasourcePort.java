package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service23.model.Model23;
import java.util.Optional;

public interface Entity23DatasourcePort {
    Optional<Model23> find(Long id);
}
