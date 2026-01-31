package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service486.model.Model486;
import java.util.Optional;

public interface Entity486DatasourcePort {
    Optional<Model486> find(Long id);
}
