package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service453.model.Model453;
import java.util.Optional;

public interface Entity453DatasourcePort {
    Optional<Model453> find(Long id);
}
