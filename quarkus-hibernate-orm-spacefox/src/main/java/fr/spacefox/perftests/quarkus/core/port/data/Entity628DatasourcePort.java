package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service628.model.Model628;
import java.util.Optional;

public interface Entity628DatasourcePort {
    Optional<Model628> find(Long id);
}
