package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service805.model.Model805;
import java.util.Optional;

public interface Entity805DatasourcePort {
    Optional<Model805> find(Long id);
}
