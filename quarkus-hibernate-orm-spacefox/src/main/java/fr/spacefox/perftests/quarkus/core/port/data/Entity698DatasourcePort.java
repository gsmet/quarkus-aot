package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service698.model.Model698;
import java.util.Optional;

public interface Entity698DatasourcePort {
    Optional<Model698> find(Long id);
}
