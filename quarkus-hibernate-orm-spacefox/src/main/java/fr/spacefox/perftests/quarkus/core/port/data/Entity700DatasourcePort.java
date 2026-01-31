package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service700.model.Model700;
import java.util.Optional;

public interface Entity700DatasourcePort {
    Optional<Model700> find(Long id);
}
