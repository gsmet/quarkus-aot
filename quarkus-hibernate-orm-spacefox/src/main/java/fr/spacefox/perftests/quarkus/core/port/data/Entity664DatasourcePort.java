package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service664.model.Model664;
import java.util.Optional;

public interface Entity664DatasourcePort {
    Optional<Model664> find(Long id);
}
