package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service379.model.Model379;
import java.util.Optional;

public interface Entity379DatasourcePort {
    Optional<Model379> find(Long id);
}
