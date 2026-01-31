package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service754.model.Model754;
import java.util.Optional;

public interface Entity754DatasourcePort {
    Optional<Model754> find(Long id);
}
