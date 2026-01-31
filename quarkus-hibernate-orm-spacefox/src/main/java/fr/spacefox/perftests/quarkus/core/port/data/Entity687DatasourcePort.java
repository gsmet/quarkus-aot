package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service687.model.Model687;
import java.util.Optional;

public interface Entity687DatasourcePort {
    Optional<Model687> find(Long id);
}
