package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service332.model.Model332;
import java.util.Optional;

public interface Entity332DatasourcePort {
    Optional<Model332> find(Long id);
}
