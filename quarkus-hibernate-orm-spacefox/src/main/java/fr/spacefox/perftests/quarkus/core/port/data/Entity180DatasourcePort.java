package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service180.model.Model180;
import java.util.Optional;

public interface Entity180DatasourcePort {
    Optional<Model180> find(Long id);
}
