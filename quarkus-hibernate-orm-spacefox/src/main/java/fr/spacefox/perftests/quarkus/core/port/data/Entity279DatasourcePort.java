package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service279.model.Model279;
import java.util.Optional;

public interface Entity279DatasourcePort {
    Optional<Model279> find(Long id);
}
