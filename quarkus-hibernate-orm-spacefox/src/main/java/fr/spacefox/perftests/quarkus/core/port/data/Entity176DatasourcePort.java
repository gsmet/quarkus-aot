package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service176.model.Model176;
import java.util.Optional;

public interface Entity176DatasourcePort {
    Optional<Model176> find(Long id);
}
