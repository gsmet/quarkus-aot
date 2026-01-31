package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service556.model.Model556;
import java.util.Optional;

public interface Entity556DatasourcePort {
    Optional<Model556> find(Long id);
}
