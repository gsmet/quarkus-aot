package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service501.model.Model501;
import java.util.Optional;

public interface Entity501DatasourcePort {
    Optional<Model501> find(Long id);
}
