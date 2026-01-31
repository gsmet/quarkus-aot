package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service645.model.Model645;
import java.util.Optional;

public interface Entity645DatasourcePort {
    Optional<Model645> find(Long id);
}
