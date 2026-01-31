package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service634.model.Model634;
import java.util.Optional;

public interface Entity634DatasourcePort {
    Optional<Model634> find(Long id);
}
