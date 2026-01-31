package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service582.model.Model582;
import java.util.Optional;

public interface Entity582DatasourcePort {
    Optional<Model582> find(Long id);
}
