package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service969.model.Model969;
import java.util.Optional;

public interface Entity969DatasourcePort {
    Optional<Model969> find(Long id);
}
