package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service756.model.Model756;
import java.util.Optional;

public interface Entity756DatasourcePort {
    Optional<Model756> find(Long id);
}
