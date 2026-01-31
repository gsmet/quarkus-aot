package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service294.model.Model294;
import java.util.Optional;

public interface Entity294DatasourcePort {
    Optional<Model294> find(Long id);
}
