package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service647.model.Model647;
import java.util.Optional;

public interface Entity647DatasourcePort {
    Optional<Model647> find(Long id);
}
