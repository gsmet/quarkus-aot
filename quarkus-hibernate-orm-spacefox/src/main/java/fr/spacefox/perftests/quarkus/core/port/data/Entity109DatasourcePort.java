package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service109.model.Model109;
import java.util.Optional;

public interface Entity109DatasourcePort {
    Optional<Model109> find(Long id);
}
