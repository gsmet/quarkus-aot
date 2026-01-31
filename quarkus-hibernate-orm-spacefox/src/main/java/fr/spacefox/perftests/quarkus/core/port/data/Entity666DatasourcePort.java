package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service666.model.Model666;
import java.util.Optional;

public interface Entity666DatasourcePort {
    Optional<Model666> find(Long id);
}
