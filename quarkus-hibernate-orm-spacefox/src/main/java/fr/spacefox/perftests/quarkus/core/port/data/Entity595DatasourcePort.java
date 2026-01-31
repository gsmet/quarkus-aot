package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service595.model.Model595;
import java.util.Optional;

public interface Entity595DatasourcePort {
    Optional<Model595> find(Long id);
}
