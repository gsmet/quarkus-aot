package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service442.model.Model442;
import java.util.Optional;

public interface Entity442DatasourcePort {
    Optional<Model442> find(Long id);
}
