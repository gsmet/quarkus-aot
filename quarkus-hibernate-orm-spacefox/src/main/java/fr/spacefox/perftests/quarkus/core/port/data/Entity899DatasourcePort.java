package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service899.model.Model899;
import java.util.Optional;

public interface Entity899DatasourcePort {
    Optional<Model899> find(Long id);
}
