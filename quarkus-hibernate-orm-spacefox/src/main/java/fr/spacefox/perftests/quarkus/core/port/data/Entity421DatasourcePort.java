package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service421.model.Model421;
import java.util.Optional;

public interface Entity421DatasourcePort {
    Optional<Model421> find(Long id);
}
