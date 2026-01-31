package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service926.model.Model926;
import java.util.Optional;

public interface Entity926DatasourcePort {
    Optional<Model926> find(Long id);
}
