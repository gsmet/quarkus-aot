package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service524.model.Model524;
import java.util.Optional;

public interface Entity524DatasourcePort {
    Optional<Model524> find(Long id);
}
