package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service764.model.Model764;
import java.util.Optional;

public interface Entity764DatasourcePort {
    Optional<Model764> find(Long id);
}
