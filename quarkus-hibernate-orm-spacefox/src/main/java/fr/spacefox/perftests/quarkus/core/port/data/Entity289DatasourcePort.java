package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service289.model.Model289;
import java.util.Optional;

public interface Entity289DatasourcePort {
    Optional<Model289> find(Long id);
}
