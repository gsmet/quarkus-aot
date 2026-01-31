package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service778.model.Model778;
import java.util.Optional;

public interface Entity778DatasourcePort {
    Optional<Model778> find(Long id);
}
