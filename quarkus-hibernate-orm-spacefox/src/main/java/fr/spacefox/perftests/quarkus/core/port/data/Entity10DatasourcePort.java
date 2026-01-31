package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service10.model.Model10;
import java.util.Optional;

public interface Entity10DatasourcePort {
    Optional<Model10> find(Long id);
}
