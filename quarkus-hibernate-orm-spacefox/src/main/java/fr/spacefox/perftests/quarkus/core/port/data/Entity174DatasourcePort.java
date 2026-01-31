package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service174.model.Model174;
import java.util.Optional;

public interface Entity174DatasourcePort {
    Optional<Model174> find(Long id);
}
