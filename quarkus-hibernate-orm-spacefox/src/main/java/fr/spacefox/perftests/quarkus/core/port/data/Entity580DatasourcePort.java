package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service580.model.Model580;
import java.util.Optional;

public interface Entity580DatasourcePort {
    Optional<Model580> find(Long id);
}
