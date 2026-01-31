package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service171.model.Model171;
import java.util.Optional;

public interface Entity171DatasourcePort {
    Optional<Model171> find(Long id);
}
