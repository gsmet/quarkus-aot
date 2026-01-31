package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service747.model.Model747;
import java.util.Optional;

public interface Entity747DatasourcePort {
    Optional<Model747> find(Long id);
}
