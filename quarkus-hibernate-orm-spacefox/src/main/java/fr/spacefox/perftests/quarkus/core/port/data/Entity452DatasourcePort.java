package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service452.model.Model452;
import java.util.Optional;

public interface Entity452DatasourcePort {
    Optional<Model452> find(Long id);
}
