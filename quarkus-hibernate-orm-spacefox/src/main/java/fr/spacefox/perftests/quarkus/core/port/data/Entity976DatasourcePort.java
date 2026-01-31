package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service976.model.Model976;
import java.util.Optional;

public interface Entity976DatasourcePort {
    Optional<Model976> find(Long id);
}
