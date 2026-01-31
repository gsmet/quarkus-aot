package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service359.model.Model359;
import java.util.Optional;

public interface Entity359DatasourcePort {
    Optional<Model359> find(Long id);
}
