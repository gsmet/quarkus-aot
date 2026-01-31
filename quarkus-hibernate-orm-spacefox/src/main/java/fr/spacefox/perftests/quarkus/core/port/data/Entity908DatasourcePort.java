package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service908.model.Model908;
import java.util.Optional;

public interface Entity908DatasourcePort {
    Optional<Model908> find(Long id);
}
