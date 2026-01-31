package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service306.model.Model306;
import java.util.Optional;

public interface Entity306DatasourcePort {
    Optional<Model306> find(Long id);
}
