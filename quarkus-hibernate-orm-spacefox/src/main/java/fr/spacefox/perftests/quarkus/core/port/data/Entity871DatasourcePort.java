package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service871.model.Model871;
import java.util.Optional;

public interface Entity871DatasourcePort {
    Optional<Model871> find(Long id);
}
