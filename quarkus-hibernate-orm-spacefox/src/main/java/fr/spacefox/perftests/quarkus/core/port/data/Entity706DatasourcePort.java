package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service706.model.Model706;
import java.util.Optional;

public interface Entity706DatasourcePort {
    Optional<Model706> find(Long id);
}
