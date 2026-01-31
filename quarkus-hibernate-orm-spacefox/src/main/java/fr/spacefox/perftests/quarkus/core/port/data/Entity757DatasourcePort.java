package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service757.model.Model757;
import java.util.Optional;

public interface Entity757DatasourcePort {
    Optional<Model757> find(Long id);
}
