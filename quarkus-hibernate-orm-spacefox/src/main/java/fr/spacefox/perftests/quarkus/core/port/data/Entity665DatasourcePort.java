package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service665.model.Model665;
import java.util.Optional;

public interface Entity665DatasourcePort {
    Optional<Model665> find(Long id);
}
