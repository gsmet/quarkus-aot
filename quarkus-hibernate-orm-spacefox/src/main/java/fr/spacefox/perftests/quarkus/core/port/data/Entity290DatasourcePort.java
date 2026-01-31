package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service290.model.Model290;
import java.util.Optional;

public interface Entity290DatasourcePort {
    Optional<Model290> find(Long id);
}
