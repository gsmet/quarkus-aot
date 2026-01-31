package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service957.model.Model957;
import java.util.Optional;

public interface Entity957DatasourcePort {
    Optional<Model957> find(Long id);
}
