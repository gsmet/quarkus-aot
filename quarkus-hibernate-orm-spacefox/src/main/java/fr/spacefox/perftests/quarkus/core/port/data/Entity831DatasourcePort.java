package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service831.model.Model831;
import java.util.Optional;

public interface Entity831DatasourcePort {
    Optional<Model831> find(Long id);
}
