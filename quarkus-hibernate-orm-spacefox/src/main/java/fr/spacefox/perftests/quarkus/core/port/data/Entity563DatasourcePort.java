package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service563.model.Model563;
import java.util.Optional;

public interface Entity563DatasourcePort {
    Optional<Model563> find(Long id);
}
