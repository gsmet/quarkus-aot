package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service86.model.Model86;
import java.util.Optional;

public interface Entity86DatasourcePort {
    Optional<Model86> find(Long id);
}
