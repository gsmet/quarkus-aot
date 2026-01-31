package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service816.model.Model816;
import java.util.Optional;

public interface Entity816DatasourcePort {
    Optional<Model816> find(Long id);
}
