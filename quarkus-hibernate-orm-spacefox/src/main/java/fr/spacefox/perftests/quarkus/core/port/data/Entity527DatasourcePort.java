package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service527.model.Model527;
import java.util.Optional;

public interface Entity527DatasourcePort {
    Optional<Model527> find(Long id);
}
