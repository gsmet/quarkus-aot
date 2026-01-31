package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service853.model.Model853;
import java.util.Optional;

public interface Entity853DatasourcePort {
    Optional<Model853> find(Long id);
}
