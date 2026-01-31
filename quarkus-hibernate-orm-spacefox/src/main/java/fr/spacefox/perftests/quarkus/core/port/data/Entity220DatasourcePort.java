package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service220.model.Model220;
import java.util.Optional;

public interface Entity220DatasourcePort {
    Optional<Model220> find(Long id);
}
