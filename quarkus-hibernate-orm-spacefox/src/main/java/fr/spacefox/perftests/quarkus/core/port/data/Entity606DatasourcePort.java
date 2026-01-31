package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service606.model.Model606;
import java.util.Optional;

public interface Entity606DatasourcePort {
    Optional<Model606> find(Long id);
}
