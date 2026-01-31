package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service365.model.Model365;
import java.util.Optional;

public interface Entity365DatasourcePort {
    Optional<Model365> find(Long id);
}
