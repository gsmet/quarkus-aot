package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service818.model.Model818;
import java.util.Optional;

public interface Entity818DatasourcePort {
    Optional<Model818> find(Long id);
}
