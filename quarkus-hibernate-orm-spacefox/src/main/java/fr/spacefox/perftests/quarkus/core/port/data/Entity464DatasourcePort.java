package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service464.model.Model464;
import java.util.Optional;

public interface Entity464DatasourcePort {
    Optional<Model464> find(Long id);
}
