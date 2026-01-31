package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service335.model.Model335;
import java.util.Optional;

public interface Entity335DatasourcePort {
    Optional<Model335> find(Long id);
}
