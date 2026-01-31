package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service368.model.Model368;
import java.util.Optional;

public interface Entity368DatasourcePort {
    Optional<Model368> find(Long id);
}
