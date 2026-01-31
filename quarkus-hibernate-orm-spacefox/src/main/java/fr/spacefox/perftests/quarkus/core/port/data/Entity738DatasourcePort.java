package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service738.model.Model738;
import java.util.Optional;

public interface Entity738DatasourcePort {
    Optional<Model738> find(Long id);
}
