package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service405.model.Model405;
import java.util.Optional;

public interface Entity405DatasourcePort {
    Optional<Model405> find(Long id);
}
