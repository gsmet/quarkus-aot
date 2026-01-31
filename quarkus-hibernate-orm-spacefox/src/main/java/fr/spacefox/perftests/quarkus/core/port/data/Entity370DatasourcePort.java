package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service370.model.Model370;
import java.util.Optional;

public interface Entity370DatasourcePort {
    Optional<Model370> find(Long id);
}
