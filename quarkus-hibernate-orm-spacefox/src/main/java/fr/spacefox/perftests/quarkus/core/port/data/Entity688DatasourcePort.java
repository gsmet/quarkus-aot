package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service688.model.Model688;
import java.util.Optional;

public interface Entity688DatasourcePort {
    Optional<Model688> find(Long id);
}
