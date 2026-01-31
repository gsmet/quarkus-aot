package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service91.model.Model91;
import java.util.Optional;

public interface Entity91DatasourcePort {
    Optional<Model91> find(Long id);
}
