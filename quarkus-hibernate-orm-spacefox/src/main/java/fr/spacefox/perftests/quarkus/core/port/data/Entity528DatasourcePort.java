package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service528.model.Model528;
import java.util.Optional;

public interface Entity528DatasourcePort {
    Optional<Model528> find(Long id);
}
