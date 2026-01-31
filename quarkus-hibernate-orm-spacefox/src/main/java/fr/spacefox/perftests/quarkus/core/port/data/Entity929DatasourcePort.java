package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service929.model.Model929;
import java.util.Optional;

public interface Entity929DatasourcePort {
    Optional<Model929> find(Long id);
}
