package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service945.model.Model945;
import java.util.Optional;

public interface Entity945DatasourcePort {
    Optional<Model945> find(Long id);
}
