package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service194.model.Model194;
import java.util.Optional;

public interface Entity194DatasourcePort {
    Optional<Model194> find(Long id);
}
