package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service406.model.Model406;
import java.util.Optional;

public interface Entity406DatasourcePort {
    Optional<Model406> find(Long id);
}
