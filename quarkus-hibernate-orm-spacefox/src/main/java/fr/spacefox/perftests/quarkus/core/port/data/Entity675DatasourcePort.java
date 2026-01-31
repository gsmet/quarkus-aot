package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service675.model.Model675;
import java.util.Optional;

public interface Entity675DatasourcePort {
    Optional<Model675> find(Long id);
}
