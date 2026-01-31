package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service561.model.Model561;
import java.util.Optional;

public interface Entity561DatasourcePort {
    Optional<Model561> find(Long id);
}
