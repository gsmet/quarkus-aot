package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service87.model.Model87;
import java.util.Optional;

public interface Entity87DatasourcePort {
    Optional<Model87> find(Long id);
}
