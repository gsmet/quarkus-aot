package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service886.model.Model886;
import java.util.Optional;

public interface Entity886DatasourcePort {
    Optional<Model886> find(Long id);
}
