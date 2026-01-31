package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service590.model.Model590;
import java.util.Optional;

public interface Entity590DatasourcePort {
    Optional<Model590> find(Long id);
}
