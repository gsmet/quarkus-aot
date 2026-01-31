package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service885.model.Model885;
import java.util.Optional;

public interface Entity885DatasourcePort {
    Optional<Model885> find(Long id);
}
