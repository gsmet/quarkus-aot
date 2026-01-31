package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service408.model.Model408;
import java.util.Optional;

public interface Entity408DatasourcePort {
    Optional<Model408> find(Long id);
}
