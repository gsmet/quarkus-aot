package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service638.model.Model638;
import java.util.Optional;

public interface Entity638DatasourcePort {
    Optional<Model638> find(Long id);
}
