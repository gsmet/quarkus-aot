package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service994.model.Model994;
import java.util.Optional;

public interface Entity994DatasourcePort {
    Optional<Model994> find(Long id);
}
