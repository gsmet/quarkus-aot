package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service148.model.Model148;
import java.util.Optional;

public interface Entity148DatasourcePort {
    Optional<Model148> find(Long id);
}
