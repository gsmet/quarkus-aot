package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service829.model.Model829;
import java.util.Optional;

public interface Entity829DatasourcePort {
    Optional<Model829> find(Long id);
}
