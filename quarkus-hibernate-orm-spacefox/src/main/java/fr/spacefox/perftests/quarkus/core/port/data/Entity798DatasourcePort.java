package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service798.model.Model798;
import java.util.Optional;

public interface Entity798DatasourcePort {
    Optional<Model798> find(Long id);
}
