package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service794.model.Model794;
import java.util.Optional;

public interface Entity794DatasourcePort {
    Optional<Model794> find(Long id);
}
