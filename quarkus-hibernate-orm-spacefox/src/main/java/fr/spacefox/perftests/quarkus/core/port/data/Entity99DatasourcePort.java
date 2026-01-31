package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service99.model.Model99;
import java.util.Optional;

public interface Entity99DatasourcePort {
    Optional<Model99> find(Long id);
}
