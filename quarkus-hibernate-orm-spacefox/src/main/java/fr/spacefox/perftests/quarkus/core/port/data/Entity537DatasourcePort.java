package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service537.model.Model537;
import java.util.Optional;

public interface Entity537DatasourcePort {
    Optional<Model537> find(Long id);
}
