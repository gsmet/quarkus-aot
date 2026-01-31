package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service392.model.Model392;
import java.util.Optional;

public interface Entity392DatasourcePort {
    Optional<Model392> find(Long id);
}
