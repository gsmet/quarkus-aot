package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service860.model.Model860;
import java.util.Optional;

public interface Entity860DatasourcePort {
    Optional<Model860> find(Long id);
}
