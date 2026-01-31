package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service215.model.Model215;
import java.util.Optional;

public interface Entity215DatasourcePort {
    Optional<Model215> find(Long id);
}
