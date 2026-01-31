package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service975.model.Model975;
import java.util.Optional;

public interface Entity975DatasourcePort {
    Optional<Model975> find(Long id);
}
