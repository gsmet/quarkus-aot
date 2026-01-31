package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service869.model.Model869;
import java.util.Optional;

public interface Entity869DatasourcePort {
    Optional<Model869> find(Long id);
}
