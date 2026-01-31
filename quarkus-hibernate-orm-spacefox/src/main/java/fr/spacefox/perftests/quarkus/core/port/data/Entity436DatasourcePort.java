package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service436.model.Model436;
import java.util.Optional;

public interface Entity436DatasourcePort {
    Optional<Model436> find(Long id);
}
