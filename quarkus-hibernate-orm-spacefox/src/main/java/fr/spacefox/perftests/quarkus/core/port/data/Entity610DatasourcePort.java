package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service610.model.Model610;
import java.util.Optional;

public interface Entity610DatasourcePort {
    Optional<Model610> find(Long id);
}
