package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service221.model.Model221;
import java.util.Optional;

public interface Entity221DatasourcePort {
    Optional<Model221> find(Long id);
}
