package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service779.model.Model779;
import java.util.Optional;

public interface Entity779DatasourcePort {
    Optional<Model779> find(Long id);
}
