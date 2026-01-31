package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service920.model.Model920;
import java.util.Optional;

public interface Entity920DatasourcePort {
    Optional<Model920> find(Long id);
}
