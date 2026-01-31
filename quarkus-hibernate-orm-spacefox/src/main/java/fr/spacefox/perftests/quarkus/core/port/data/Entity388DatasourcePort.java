package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service388.model.Model388;
import java.util.Optional;

public interface Entity388DatasourcePort {
    Optional<Model388> find(Long id);
}
