package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service115.model.Model115;
import java.util.Optional;

public interface Entity115DatasourcePort {
    Optional<Model115> find(Long id);
}
