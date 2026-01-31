package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service253.model.Model253;
import java.util.Optional;

public interface Entity253DatasourcePort {
    Optional<Model253> find(Long id);
}
