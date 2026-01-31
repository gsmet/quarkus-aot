package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service616.model.Model616;
import java.util.Optional;

public interface Entity616DatasourcePort {
    Optional<Model616> find(Long id);
}
