package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service458.model.Model458;
import java.util.Optional;

public interface Entity458DatasourcePort {
    Optional<Model458> find(Long id);
}
