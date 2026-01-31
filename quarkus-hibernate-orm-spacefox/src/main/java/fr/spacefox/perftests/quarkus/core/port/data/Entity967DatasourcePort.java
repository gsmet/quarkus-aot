package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service967.model.Model967;
import java.util.Optional;

public interface Entity967DatasourcePort {
    Optional<Model967> find(Long id);
}
