package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service457.model.Model457;
import java.util.Optional;

public interface Entity457DatasourcePort {
    Optional<Model457> find(Long id);
}
