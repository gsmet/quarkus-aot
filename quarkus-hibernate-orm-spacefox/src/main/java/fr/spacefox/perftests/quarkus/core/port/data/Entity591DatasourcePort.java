package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service591.model.Model591;
import java.util.Optional;

public interface Entity591DatasourcePort {
    Optional<Model591> find(Long id);
}
