package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service260.model.Model260;
import java.util.Optional;

public interface Entity260DatasourcePort {
    Optional<Model260> find(Long id);
}
