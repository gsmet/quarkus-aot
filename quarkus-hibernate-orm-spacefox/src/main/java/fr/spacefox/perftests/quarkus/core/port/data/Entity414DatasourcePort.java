package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service414.model.Model414;
import java.util.Optional;

public interface Entity414DatasourcePort {
    Optional<Model414> find(Long id);
}
