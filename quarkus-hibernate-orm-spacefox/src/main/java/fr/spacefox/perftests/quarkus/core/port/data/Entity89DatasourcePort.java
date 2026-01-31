package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service89.model.Model89;
import java.util.Optional;

public interface Entity89DatasourcePort {
    Optional<Model89> find(Long id);
}
