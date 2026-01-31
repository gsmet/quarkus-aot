package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service230.model.Model230;
import java.util.Optional;

public interface Entity230DatasourcePort {
    Optional<Model230> find(Long id);
}
