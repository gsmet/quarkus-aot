package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service114.model.Model114;
import java.util.Optional;

public interface Entity114DatasourcePort {
    Optional<Model114> find(Long id);
}
