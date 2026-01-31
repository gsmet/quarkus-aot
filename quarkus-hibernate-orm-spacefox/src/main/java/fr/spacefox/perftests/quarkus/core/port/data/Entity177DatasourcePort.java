package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service177.model.Model177;
import java.util.Optional;

public interface Entity177DatasourcePort {
    Optional<Model177> find(Long id);
}
