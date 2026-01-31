package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service22.model.Model22;
import java.util.Optional;

public interface Entity22DatasourcePort {
    Optional<Model22> find(Long id);
}
