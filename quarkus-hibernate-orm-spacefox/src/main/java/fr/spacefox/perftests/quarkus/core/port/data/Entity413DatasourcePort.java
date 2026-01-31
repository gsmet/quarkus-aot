package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service413.model.Model413;
import java.util.Optional;

public interface Entity413DatasourcePort {
    Optional<Model413> find(Long id);
}
