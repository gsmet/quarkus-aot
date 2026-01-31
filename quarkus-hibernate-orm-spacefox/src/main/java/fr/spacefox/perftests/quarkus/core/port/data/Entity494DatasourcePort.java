package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service494.model.Model494;
import java.util.Optional;

public interface Entity494DatasourcePort {
    Optional<Model494> find(Long id);
}
