package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service611.model.Model611;
import java.util.Optional;

public interface Entity611DatasourcePort {
    Optional<Model611> find(Long id);
}
