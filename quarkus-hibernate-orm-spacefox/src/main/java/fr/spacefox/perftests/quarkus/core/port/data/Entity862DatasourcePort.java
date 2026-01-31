package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service862.model.Model862;
import java.util.Optional;

public interface Entity862DatasourcePort {
    Optional<Model862> find(Long id);
}
