package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service727.model.Model727;
import java.util.Optional;

public interface Entity727DatasourcePort {
    Optional<Model727> find(Long id);
}
