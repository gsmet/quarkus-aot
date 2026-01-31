package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service415.model.Model415;
import java.util.Optional;

public interface Entity415DatasourcePort {
    Optional<Model415> find(Long id);
}
