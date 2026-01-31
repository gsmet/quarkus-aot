package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service68.model.Model68;
import java.util.Optional;

public interface Entity68DatasourcePort {
    Optional<Model68> find(Long id);
}
