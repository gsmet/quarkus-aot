package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service551.model.Model551;
import java.util.Optional;

public interface Entity551DatasourcePort {
    Optional<Model551> find(Long id);
}
